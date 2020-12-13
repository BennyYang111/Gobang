import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

class ThreadBySubclass extends Thread
{
	SocketChannel sc = null;
	int			localPort = 0;
	List<String> pos = new ArrayList<>();
	List<String> people = new ArrayList<>();
	Queue<String> queue = new LinkedList<>();
	Queue<String> proQueue = new LinkedList<>();

	public ThreadBySubclass(SocketChannel sc, Queue<String> queue, Queue<String> proQueue, List<String> pos, List<String> people) // Constructor
	{
		this.sc = sc;
		this.pos = pos;
		this.people = people;
		this.queue = queue;
		this.proQueue = proQueue;
	}
	public void run()
	{
		
		ByteBuffer 	b = ByteBuffer.allocate(1000); 
		
		String		getdata = "";
		String		data = "";
		
		try{
			while(true){
				int			len = sc.read(b);
				String playerPosition = new String(b.array(), 0, len);
				StringTokenizer str = new StringTokenizer(playerPosition, " ");
				String player = str.nextToken();
				
				if (player.equals("signIn") == true || player.equals("wait") == true || player.equals("waitTimeOut") == true || player.equals("logOut") == true || player.equals("logOutNoPlay") == true || player.equals("lobbyWaitTimeOut") == true)
				{
					localPort = 8886;
				}
				else if (player.equals("Pplayer1") == true || player.equals("Pplayer2") == true)
				{
					localPort = 8889;
				}
				else if (player.equals("Wplayer2") == true || player.equals("Wplayer1") == true)
				{
					localPort = 8888;
				}
				else if (player.equals("SELECT") == true || player.equals("right") == true || player.equals("waitStart") == true || player.equals("wantStart") == true || player.equals("timeOut") == true)
				{
					localPort = 8885;
				}
				else
				{
					localPort = 8887;
				}
				
				//System.out.println("getPosition::::: " + pos.get(0));
				//System.out.println("pos::::: " + pos.get(1));
				
				if(len > 0)
				{
					//System.out.println("port: " + localPort);
					if (player.equals("SELECT") == true)System.out.println("msg: " + "SignIn");
                    else if (player.equals("SELECT") != true)System.out.println("msg: " + new String(b.array(), 0, len));
					//System.out.println("size: " + queue.size());
					//System.out.println("player: " + player);
					
					if (localPort == 8889)
					{
						if (((pos.get(0).equals("Wplayer1") == true && player.equals("Pplayer2") == true) || (pos.get(0).equals("Wplayer2") == true && player.equals("Pplayer1") == true)) && pos.get(1).equals("0 0") == true)
						{
							//System.out.println("place 0 in 1");

							//if (pos.get(0).equals("Wplayer1") == true) pos.set(0, "Wplayer2");
							//else if (pos.get(0).equals("Wplayer2") == true) pos.set(0, "Wplayer1");
							
							data = str.nextToken() + " " + str.nextToken();
							pos.set(1, data);
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							break;
						}
						/*else
						{
							data = "";
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							break;
						}*/
					}
					
					if (localPort == 8888)
					{
						if (queue.size() < 2)
						{
							data = "logout " + player;
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							break;
						}
						else if ((player.equals("Wplayer2") == true || player.equals("Wplayer1") == true) && pos.get(1).equals("0 0") != true)
						{
							if (pos.get(0).equals("Wplayer1") == true) pos.set(0, "Wplayer2");
							else if (pos.get(0).equals("Wplayer2") == true) pos.set(0, "Wplayer1");
							
							data = pos.get(1);
							pos.set(1, "0 0");
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							break;
						}
						else
						{
							data = "";
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							break;
						}
					}
					
					if (localPort == 8885)
					{
						if (player.equals("SELECT") == true)
						{
							try 
							 {
								 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
						         String url = "jdbc:sqlserver://LAPTOP-5FC3MHVF\\LYRICS:1433;databaseName=master;user=user;password=user";
						         
						         Connection conn = DriverManager.getConnection(url);
						         if (conn != null && !conn.isClosed())
						         {	
						        	 String password = "";
						        	 
						        	 //System.out.println("資料庫連線測試成功！");
						        	 PreparedStatement prep = conn.prepareStatement(playerPosition);
					        		 Statement stmt = conn.createStatement();
					        		 
					        		 ResultSet rs = stmt.executeQuery(playerPosition);
					        		 
					        		 //System.out.println(rs);
					        		 //if (rs.equals("SQLServerResultSet:2") == true)
					        		 //{
					        			 while (rs.next()) {
							        		 password = rs.getString("password");
						        		 }
					        		 //}
					        		 
					        		 rs.close();
						        	 conn.close();
						        	 
						        	 if (password != "")
						        	 {
						        		 ByteBuffer buffer = ByteBuffer.wrap(password.getBytes());
						        		 sc.write(buffer);
						        		 break;
						        	 }
						        	 else
						        	 {
						        		 //System.out.println("|" + password + "|");
						        		 ByteBuffer buffer = ByteBuffer.wrap(password.getBytes());
						        		 //System.out.println("|" + "456" + "|");
						        		 sc.write(buffer);
						        		 //System.out.println("|" + "789" + "|");
						        		 break;
						        	 }
						         }
						     }
						     catch(ClassNotFoundException e) {
						    	 //System.out.println("找不到驅動程式類別"); 
						         e.printStackTrace();
						     }
						     catch(SQLException e)
							 { 
						         e.printStackTrace();
						     }
						}
						else if (player.equals("right") == true)
						{
							String name = str.nextToken();
							//System.out.println("nnnnnnnnnnnnnnname::: " + name);
							
							if (people.get(0).equals("player1") == true && people.get(1).equals("player2") == true)
							{
								people.set(0, name);
							}
							else if (people.get(0).equals("player1") != true && people.get(1).equals("player2") == true)
							{
								if (name.equals(people.get(0)) == true)
								{
									//System.out.println("123456789");
									data = "sameNo";
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									//System.out.println("111111:: " + new String(buffer.array()) + "1111111111111");
									sc.write(buffer);
								}
								else
								{
									people.set(1, name);
								}
							}
							break;
						}
						else if (player.equals("waitStart") == true)
						{
							//System.out.println("White pos[2] === " + pos.get(2));
							//System.out.println("White pos[3] === " + pos.get(3));
							
							if (pos.get(3).equals("noWait") == true || pos.get(3).equals("whiteWaitBlack") == true)
							{
								pos.set(0, "Wplayer1");
						    	pos.set(1, "0 0");
						    	pos.set(3, "whiteWaitBlack");
						    	//System.out.println("Whiteasdasdasd pos[3] === " + pos.get(3));
								String waitStart = pos.get(2);
								
								//System.out.println("pos[2] === " + pos.get(2));
								
								if (waitStart.equals("yes") == true)
								{
									//waitStart = pos.get(2);
									pos.set(2, "no");
									pos.set(3, "noWait");
									data = waitStart;
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
								
								if (waitStart.equals("logOut") == true || queue.size() < 2)
								{
									//waitStart = pos.get(2);
									pos.set(2, "no");
									pos.set(3, "noWait");
									data = "logOut";
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
								
								if (pos.get(2).equals("no") == true)
								{
									data = "";
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
							}
							else if (pos.get(3).equals("blackWaitWhite") == true)
							{								
								pos.set(0, "Wplayer1");
								pos.set(1, "0 0");
								
								if (queue.size() == 2)
								{
									pos.set(2, "yes");
									data = "yes";
								}
								else if (queue.size() < 2)
								{
									pos.set(2, "no");
									data = "logOut";
								}
								
								ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
								sc.write(buffer);
								break;
							}
						}
						else if (player.equals("wantStart") == true)
						{
							//System.out.println("Black pos[2] === " + pos.get(2));
							//System.out.println("Black pos[3] === " + pos.get(3));
							
							if (pos.get(3).equals("noWait") == true || pos.get(3).equals("blackWaitWhite") == true)
							{
								pos.set(0, "Wplayer1");
						    	pos.set(1, "0 0");
						    	pos.set(3, "blackWaitWhite");
								String waitStart = pos.get(2);
								
								//System.out.println("pos[2] === " + pos.get(2));
								
								if (waitStart.equals("yes") == true)
								{
									//waitStart = pos.get(2);
									pos.set(2, "no");
									pos.set(3, "noWait");
									data = waitStart;
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
								
								if (waitStart.equals("logOut") == true || queue.size() < 2)
								{
									//waitStart = pos.get(2);
									pos.set(2, "no");
									pos.set(3, "noWait");
									data = "logOut";
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
								
								if (pos.get(2).equals("no") == true)
								{
									data = "";
									ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
									sc.write(buffer);
									break;
								}
							}
							else if (pos.get(3).equals("whiteWaitBlack") == true)
							{
								if (queue.size() == 2)
								{
									pos.set(2, "yes");
									data = "yes";
								}
								else if (queue.size() < 2)
								{
									pos.set(2, "no");
									data = "logOut";
								}
								
								ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
								sc.write(buffer);
								break;
							}
						}
						else if (player.equals("timeOut") == true)
						{
							pos.set(3, "noWait");
						}
					}
					
					if (localPort == 8887)
					{
						int same = 0;
						Statement stmt = null;
						getdata = new String(b.array(), 0, len);
						StringTokenizer st = new StringTokenizer(getdata, " ");
						String acc = st.nextToken();
						String pass = st.nextToken();
						String Sql = "INSERT INTO Gobang (account, password) VALUES (\'" + acc + "\', \'" + AES.encrypt(pass) + "\')";
						
						try
						{
							Class c = Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
							String url = "jdbc:sqlserver://LAPTOP-5FC3MHVF\\LYRICS:1433;databaseName=master;user=user;password=user";
							
							Connection conn = DriverManager.getConnection(url);
							if (conn != null && !conn.isClosed())
							{	
								//System.out.println("連接成功"); 
								String sql_search = "SELECT account FROM Gobang";
								
								stmt = conn.createStatement();
								ResultSet rs = stmt.executeQuery(sql_search);
								
								while(rs.next())
								{
									String id  = rs.getString("account");
									//System.out.println("id: " + id);
									
									if (acc.equals(id) == true)
									{
										same = 1;
									}
								}
								
								if (same == 0)
								{
									PreparedStatement prep = conn.prepareStatement(Sql);
									prep.executeUpdate();
								}
								
								conn.close();
							}
						}
						catch(ClassNotFoundException errr) {
							//System.out.println("找不到驅動程式類別"); 
						}
						catch(SQLException errr){ }
						
						if (same == 1)
						{
							data = "1";
						}
						else
						{
							data = "0";
						}
						
						ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
						sc.write(buffer);
						break;
					}
					
					if (localPort == 8886)
					{
						int success = 0;
						getdata = new String(b.array(), 0, len);
						//System.out.println("getdata: " + getdata);
                        
						if (getdata.equals("signIn") == true)
						{
							if (queue.size() < 2)
							{
								if (queue.size() == 0)
								{
									proQueue.offer("player1");
									data = "Wait for player2!!";
								}
								else if (queue.size() == 1)
								{
									proQueue.offer("player2");
									data = "play!!";
								}
								
								//System.out.println("success: " + getdata);
								success = 1;
							}
							else
							{
								data = "Players are full!!";
							}
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							
							if (success == 1)
							{
								String proQueue2queue = proQueue.poll();
								queue.offer(proQueue2queue);
							}
							break;
						}
						else if (getdata.equals("wait") == true)
						{
							String peekNum = "";
							//System.out.println("size: " + queue.size());
							if (queue.size() == 2)
							{
								peekNum = queue.peek();
								data = peekNum;
								ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
								sc.write(buffer);
								break;
							}
							
							if (queue.size() == 1)
							{
								data = "";
								ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
								sc.write(buffer);
								break;
							}
						}
						else if (getdata.equals("lobbyWaitTimeOut") == true && queue.size() < 2)
						{
							queue.poll();
                            data = "";
                            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							
							break;
						}
						else if (getdata.equals("logOut") == true)
						{
							if (queue.size() <= 2)
							{
								pos.set(2, "logOut");
								if (queue.size() == 2)
								{
									queue.poll();
									data = "player2 logout!!";
									people.set(1, "player2");
									//queue.poll();
									//data = "player1 logout!!";
								}
								else if (queue.size() == 1)
								{
									queue.poll();
									data = "player1 logout!!";
									people.set(0, "player1");
								}
								else
								{
									data = "Nobody!!";
								}
							}
							pos.set(2, "no");
							pos.set(0, "Wplayer1");
							pos.set(1, "0 0");
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							
							break;
						}
						else if (player.equals("logOutNoPlay") == true)
						{
							//if (queue.size() <= 2)
							//{
								String name = str.nextToken();
								//System.out.println("123" + name);
								
								if (people.get(0).equals(name) == true && people.get(1).equals("player2") == true)
								{
									//queue.poll();
									data = name + " logout!!";
									people.set(0, "player1");
									//queue.poll();
								}
								else if (people.get(0).equals("player1") != true && people.get(1).equals(name) == true)
								{
									data = name + " logout!!";
									people.set(1, "player2");
								}
								else if (people.get(0).equals(name) == true && people.get(1).equals("player2") != true)
								{
									data = name + " logout!!";
									people.set(0, people.get(1));
									people.set(1, "player2");
								}
								//else
								//{
									//data = "Nobody!!";
								//}
							//}
							pos.set(0, "Wplayer1");
							pos.set(1, "0 0");
							ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
							sc.write(buffer);
							
							break;
						}
					}
				}				
			}
			//System.out.println("getPosition::::: " + pos.get(0));
			//System.out.println("pos::::: " + pos.get(1));
		}
		catch(Exception e){ }
	}
}

public class Server
{  
	public static void main(String args[]) throws IOException
	{
		Selector 	selector = Selector.open();
		int			localPort = 0;
		//int			getPosition = 0;
		//String		pos = "";
		int[]		allPort = new int[5];
		List<String> pos = new ArrayList<>();			//pos[0]當getPosition的flag, pos[1]記位置, pos[2]看黑棋的人要不要再戰
		List<String> people = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		Queue<String> proQueue = new LinkedList<>();
		
		allPort[0] = 8889;		//遊戲中傳遞(放置棋子)
    	allPort[1] = 8888;		//遊玩中傳遞(等待對方)
    	allPort[2] = 8887;		//註冊帳號
    	allPort[3] = 8886;		//登入
        allPort[4] = 8885;		//連線逾時和其他

    	pos.add(0, "Wplayer1");
    	pos.add(1, "0 0");
    	pos.add(2, "no");
    	pos.add(3, "noWait");
    	people.add(0, "player1");
    	people.add(1, "player2");
    	
		for (int i = 0; i < 5 ; i++)
		{
			int port = allPort[i];

			ServerSocketChannel ssc = ServerSocketChannel.open();
			ssc.configureBlocking(false);
			ServerSocket ss = ssc.socket();
			ss.bind(new InetSocketAddress(port));

			SelectionKey key = ssc.register(selector, SelectionKey.OP_ACCEPT);			
			
			System.out.println("Listening on " + port + " port...");
		}
		
		while(true)
		{
			int num = selector.select();
			
			Set selectedKeys = selector.selectedKeys();
			Iterator element = selectedKeys.iterator(); 
			
			while(element.hasNext())
			{
				SelectionKey key = (SelectionKey)element.next();
				
				if(key.isAcceptable())
				{
					ServerSocketChannel ssc = (ServerSocketChannel)key.channel();
					SocketChannel sc = ssc.accept();
					
					localPort = sc.socket().getLocalPort();
					//System.out.println("get local port: " + localPort);
					sc.configureBlocking(false);
					
					SelectionKey newKey = sc.register(selector, SelectionKey.OP_READ);
					
					//System.out.println("Got connection from " + sc);
				}
				else if(key.isReadable())
				{
					try
					{
						SocketChannel sc = (SocketChannel)key.channel();
						ThreadBySubclass thread1 = new ThreadBySubclass(sc, queue, proQueue, pos, people);
						
						thread1.start();
						
						/*if (localPort == 8888)
						{
							try
							{
								thread1.join();
							}
							catch(InterruptedException e){ }
						}*/
					}
					catch(Exception e) { }
				}
				element.remove();
			}
		}		
	}
}
