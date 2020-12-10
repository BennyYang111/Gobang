import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ConSignIn extends Main
{
	public static int conSignIn()
	{
		ByteBuffer 	b = ByteBuffer.allocate(1000);
		String msg = "0";
		int player = 0;
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8886));
	
	        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
	        {
	            System.out.println("Loop count = " + loopcount);
	            try 
	            {
	                Thread.sleep(1000);
	            } 
	            catch (InterruptedException er) 
	            {
	                //System.err.println(er);
	            }
	        }
			
	        String data = "signIn";
	        
			ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
			sc.write(buffer);
			
			int			len = sc.read(b);
			
			while(len == 0)
			{
				try 
				{
					Thread.sleep(100);
				} 
				catch (InterruptedException er) 
				{
					System.err.println(er);
				}
				len = sc.read(b);
			}
			msg = new String(b.array(), 0, len);
			//System.out.println(msg);
			
			if (msg.equals("Wait for player2!!"))
			{
				player = 1;
			}
			else if (msg.equals("play!!"))
			{
				player = 2;
			}
			
			//System.out.println("Receive message : "	+ msg);
	
			sc.close();
		}
		catch(IOException er)
		{
			//e.printStackTrace();
		}
		
		return player;
	}
	
	public static int conWait()
	{
		int start = 0;
		int waitTime = 0;
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8886));

            // if the socket has connected, sc.finishConnect() will return false
            for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
            {
                System.out.println("Loop count = " + loopcount);
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                    start = 0;
                }
            }
				
			String wait = "wait";
			
			ByteBuffer buffer = ByteBuffer.wrap(wait.getBytes());
			sc.write(buffer);

			ByteBuffer 	b = ByteBuffer.allocate(1000); 
			int			len = sc.read(b);
			
			while(len == 0 && waitTime <= 5)		//&& waitTime <= 5
			{
            	try 
            	{
                	Thread.sleep(2000);
            	}
            	catch (InterruptedException e) 
            	{
                	System.err.println(e);
            	}
				
				//System.out.println("等待其他玩家進入...");
				
				waitTime++;
				len = sc.read(b);
				//System.out.println("len: " + len);
				//System.out.println("waitTime: " + waitTime);
				if (len > 10)
				{
					len = 0;
				}
				
				if (len == 0)
				{
					buffer = ByteBuffer.wrap(wait.getBytes());
					sc.write(buffer);
				}
			}
			
			if ((new String(b.array(), 0, len)).equals("player1") == true)
			{
				start = 1;
			}
			else
			{
				//wait = "waitTimeOut";
				//buffer = ByteBuffer.wrap(wait.getBytes());
				//sc.write(buffer);
				
				start = 0;
			}
			
			sc.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return start;
	}
	
	public static void conLogOutNoPlay(String playName)
	{
		ByteBuffer 	b = ByteBuffer.allocate(1000);
		String msg = "0";
		//int player = 0;
		
		System.out.println(playName);
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8886));
	
	        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
	        {
	            System.out.println("Loop count = " + loopcount);
	            try 
	            {
	                Thread.sleep(1000);
	            } 
	            catch (InterruptedException er) 
	            {
	                //System.err.println(er);
	            }
	        }
			
	        String data = "logOutNoPlay" + " " + playName;
	        
			ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
			sc.write(buffer);
			
			int			len = sc.read(b);
			
			while(len == 0)
			{
				try 
				{
					Thread.sleep(100);
				} 
				catch (InterruptedException er) 
				{
					System.err.println(er);
				}
				len = sc.read(b);
			}
			msg = new String(b.array(), 0, len);
			//System.out.println(msg);
			
			//System.out.println("Receive message : "	+ msg);
	
			sc.close();
		}
		catch(IOException er)
		{
			//e.printStackTrace();
		}
		
		//sreturn player;
	}
	
	public static void conLogOut()
	{
		ByteBuffer 	b = ByteBuffer.allocate(1000);
		String msg = "0";
		//int player = 0;
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8886));
	
	        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
	        {
	            System.out.println("Loop count = " + loopcount);
	            try 
	            {
	                Thread.sleep(1000);
	            } 
	            catch (InterruptedException er) 
	            {
	                //System.err.println(er);
	            }
	        }
			
	        String data = "logOut";
	        
			ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
			sc.write(buffer);
			
			int			len = sc.read(b);
			
			while(len == 0)
			{
				try 
				{
					Thread.sleep(100);
				} 
				catch (InterruptedException er) 
				{
					System.err.println(er);
				}
				len = sc.read(b);
			}
			msg = new String(b.array(), 0, len);
			//System.out.println(msg);
			
			//System.out.println("Receive message : "	+ msg);
	
			sc.close();
		}
		catch(IOException er)
		{
			//e.printStackTrace();
		}
		
		//sreturn player;
	}
	
	public static int SignIn(String acc, String pass)
	{
		ByteBuffer 	b = ByteBuffer.allocate(1000);
		ByteBuffer 	bu = ByteBuffer.allocate(1000);
		String password = "";
		int same = 0;
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8886));
	
	        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
	        {
	            System.out.println("Loop count = " + loopcount);
	            try 
	            {
	                Thread.sleep(1000);
	            } 
	            catch (InterruptedException er) 
	            {
	                //System.err.println(er);
	            }
	        }
			
	        String data = "SELECT password FROM Gobang WHERE account = \'" + acc + "\'";
	        
			ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
			sc.write(buffer);
			
			int			len = sc.read(b);
			
			//while(len == 0)
			//{
				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException er) 
				{
					System.err.println(er);
				}
				len = sc.read(b);
			//}
			password = new String(b.array(), 0, len);
			//System.out.println("password:::: " + password);
			//System.out.println("pass:::: " + pass);
	
			if (password.equals("") != true)
			{
				password = AES.decrypt(password);
				
				//System.out.println("|" + password + "|");
				
				if (password.equals(pass) == true)
				{
					same = 1;
					
					data = "right " + acc;
			        
					buffer = ByteBuffer.wrap(data.getBytes());
					sc.write(buffer);
					
					try 
					{
						Thread.sleep(100);
					}
					catch (InterruptedException er) 
					{
						System.err.println(er);
					}
					len = sc.read(bu);
					String str = new String(bu.array(), 0, len);
					/*if (str.equals("") != true)
					{
						System.out.println("|" + str + "|");
					}*/
					
					if (str.equals("sameNo"))
					{
						same = 2;
					}
				}
			}
			else
			{
				same = 0;
			}
			
			sc.close();
		}
		catch(IOException er)
		{
			//e.printStackTrace();
		}
		
		return same;
	}
}
