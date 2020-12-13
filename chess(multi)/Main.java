import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

class ThreadClassConPlay extends Thread
{
	ConPlay conPlay = new ConPlay();
	PlayFrame frame = new PlayFrame();
	Main main = new Main();
	
	int waitTime = 0;
	
	/*public ThreadClass()
	{
		
	}*/
	public void run()
	{
		try
		{
			try
			{
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress("127.0.0.1", 8889));
				
		        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
		        {
		            //System.out.println("Loop count = " + loopcount);
		            try 
		            {
		                Thread.sleep(1000);
		            }
		            catch (InterruptedException e) 
		            {
		                System.err.println(e);
		            }
		        }
				
		        String data = "waitStart";
		        
				ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
				sc.write(buffer);
				
				ByteBuffer 	b = ByteBuffer.allocate(1000); 
				int			len = sc.read(b);
				
				while(len == 0 && waitTime <= 4)
				{
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						System.err.println(e);
					}
					
					waitTime++;
					len = sc.read(b);
					String rev = new String(b.array(), 0, len);
					//System.out.println("rev::: " + rev);
					if (rev.equals("yes") == true)
					{
						//System.out.println("yesyesyesyesyesyesyesyes");
						conPlay.doSomething(1);
						//break;
					}
					else if (rev.equals("logOut") == true)
					{
						//System.out.println("logOutlogOutlogOutlogOutlogOut");
						conPlay.doSomething(2);
						//break;
					}
					
					if (len == 0)
					{
						buffer = ByteBuffer.wrap(data.getBytes());
						sc.write(buffer);
					}
				}
				
				if ((new String(b.array(), 0, len)).equals(""))
				{
					//System.out.println("O_____________O");
					main.restartTimeOut = 1;
					/*frame.timeOutMsg.setText("連線逾時...");
					frame.playPanel.add(frame.timeOutMsg);
					frame.playLayeredPane.add(frame.timeOutMsg, JLayeredPane.MODAL_LAYER);*/
				}
				
				//System.out.println("Receive message : "	+ new String(b.array(), 0, len));
				
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e){ }
	}
}

class ThreadClassTimeOut extends Thread
{
	public ThreadClassTimeOut()
	{
		
	}
	public void run()
	{
		try
		{
			try
			{
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress("127.0.0.1", 8887));
				
		        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
		        {
		            //System.out.println("Loop count = " + loopcount);
		            try 
		            {
		                Thread.sleep(1000);
		            }
		            catch (InterruptedException e) 
		            {
		                System.err.println(e);
		            }
		        }
				
		        String data = "timeOut";
		        
				ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
				sc.write(buffer);
				
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e){ }
	}
}

class ThreadClass extends Thread
{
	ConPlay conPlay = new ConPlay();
	
	int[][] win = new int[16][16];
	int player = -1;
	int choice = -1;
	int X = -1;
	int Y = -1;

	public ThreadClass(int player, int choice, int X, int Y, int[][] win)
	{
		this.player = player;
		this.choice = choice;
		this.X = X;
		this.Y = Y;
		this.win = win;
	}
	public void run()
	{
		try{
			win = conPlay.playClient(player, choice, X, Y, win);
		}
		catch(Exception e){ }
	}
}

public class Main
{
	static String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	static String blackSinglePath = Main.class.getClassLoader().getResource("./Image/black_single.png").getPath();
	static String whiteSinglePath = Main.class.getClassLoader().getResource("./Image/white_single.png").getPath();
	
	static JFrame gobangFrame;
	static JLayeredPane gobangLayeredPane = new JLayeredPane();
	
	//static ConPlay conPlay = new ConPlay();
	static ConSignIn conSignIn = new ConSignIn();
	static ConSignUp conSignUp = new ConSignUp();
	static PlayFrame frame = new PlayFrame();
	static Location local = new Location();
	static Lobby lobby = new Lobby();
	static SignUp signUp = new SignUp();
	static SignIn signIn = new SignIn();
	static Connect con = new Connect();
	static InfoMsg msg = new InfoMsg();
	static CheckWin Check = new CheckWin();
	static AES encryption = new AES();
	static int[] position = new int[5];		//0, 1記視窗座標，2, 3記棋盤座標
	static int[][] win = new int[16][16];
	static String playName = "";
	static int restartTimeOut = 0;
	static int player = -1;
	static int start = 1;
	static int put = 0;
	static int winner = 0;
	static int stepBack = 0;
	static int in = 0;
	static int restart = 0;
	
	public static int logout(int log)
	{
		int players = -1;
		
		if (in == 0 && log == 1)
		{	
			if (player == -1) players = conSignIn.conSignIn();
			else players = 1;
			
			int canPlay = 0;
			
			if (players == 1)
			{
				player = 0;
				canPlay = conSignIn.conWait();
				if (canPlay == 1)
				{
					in = 1;
				}
				else 
				{
					lobby.wait.setText("配對逾時...");
                    player = -1;
				}
			}
			else if (players == 2)
			{
				player = 1;
				in = 1;
			}
		}
		else if (in == 1 && log == 0)
		{
			in = 0;
			player = -1;
			playName = "";
			start = 1;
			winner = 0;
			stepBack = 0;
			restart = 0;
		}
		//System.out.println("in = " + in);
		//System.out.println("player = " + player);
		
		return in;
	}
	
	public static void Start()
	{
		//player = 0;
		start = 1;
		put = 0;
		winner = 0;
		restart = 0;
		gobangLayeredPane.remove(frame.playLayeredPane);
		gobangLayeredPane.removeAll();
		frame.setFrame();
		gobangLayeredPane = frame.playLayeredPane;
		gobangFrame.setLayeredPane(gobangLayeredPane);
		gobangLayeredPane.revalidate();
		gobangLayeredPane.repaint();
		frame.blackMsg.setIcon(null);
		frame.whiteMsg.setIcon(null);
		
		//System.out.println("play people====== " + player);
		
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				win[i][j] = -1;
			}
		}
		
		if (player == 0)
		{
			//start = 1;
			frame.round.setText("回合：" + Integer.toString(start));
			ImageIcon turn = new ImageIcon(frame.blackTurnPath);
			frame.Turn.setIcon(turn);
		}
		else if (player == 1)
		{
			//start = 2;
			frame.round.setText("回合：" + Integer.toString(start));
			ImageIcon turn = new ImageIcon(frame.blackTurnPath);
			frame.Turn.setIcon(turn);
			
			try
			{
				//while(true){
					ThreadClass thread1 = new ThreadClass(player, 1, position[0], position[1], win);
					
					try
					{
						Thread.sleep(1500);
					}
					catch(InterruptedException e) { }
					
					thread1.start();
				//}
			}
			catch(Exception er){ }
			
			//win = conPlay.playClient(player, 1, position[0], position[1], win);
			//System.out.println("put == " + put);
			//System.out.println("winner == " + winner);
			if (put == 1)
			{
				if (winner == 0)
				{
					start++;
					put = 0;
				}
				frame.round.setText("回合：" + Integer.toString(start));
				stepBack = 0;
			}
		}
	}
	
	public static void getMouse(int X, int Y)
	{
		position[0] = X;
		position[1] = Y;
	}
	
	public static void playerChange()
	{
		if (player == 0)
		{
			//player = 1;
			ImageIcon turn = new ImageIcon(frame.whiteTurnPath);
			frame.Turn.setIcon(turn);
			put = 0;
			start++;
			frame.round.setText("回合：" + Integer.toString(start));
		}
		else if (player == 1)
		{
			//player = 0;
			ImageIcon turn = new ImageIcon(frame.blackTurnPath);
			frame.Turn.setIcon(turn);
			put = 0;
			start++;
			frame.round.setText("回合：" + Integer.toString(start));
		}
	}
	
	public static void main(String arg[])
	{
		gobangFrame = new JFrame("五子棋");
		gobangFrame.setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		gobangFrame.setSize(600, 700);		//設置視窗大小
		gobangFrame.setLocation((int)screen.getWidth() / 4, (int)screen.getHeight() / 6);		//設置視窗位置
		gobangFrame.setIconImage(gobangFrame.getToolkit().getImage(iconPath));		//設置視窗圖示
		gobangFrame.setDefaultCloseOperation(gobangFrame.EXIT_ON_CLOSE);
		gobangFrame.setResizable(false);		//不可調整視窗大小
		
		signIn.setframeSignIn();
		gobangLayeredPane = signIn.signInLayeredPane;
		gobangFrame.setLayeredPane(gobangLayeredPane);
		
		/*frame.setFrame();
		gobangLayeredPane = frame.playLayeredPane;
		gobangFrame.setLayeredPane(gobangLayeredPane);*/
		
		gobangFrame.setVisible(true);		//讓視窗可見
		
		//msg.Info();
		
		signIn.noSignUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				signIn.account.setText("");
				signIn.password.setText("");
				signIn.info.setText("");
				
				gobangLayeredPane.remove(signIn.signInLayeredPane);
				gobangLayeredPane.removeAll();
				signUp.setframeSignUp();
				gobangLayeredPane = signUp.signUpLayeredPane;
				gobangFrame.setLayeredPane(gobangLayeredPane);
				gobangLayeredPane.revalidate();
				gobangLayeredPane.repaint();
			}
		});
		
		signIn.send.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				lobby.wait.setText("按下按鈕開始配對!");
				String account = signIn.account.getText();
				String password = new String(signIn.password.getPassword());
				
				if (account.equals("") == true || password.equals("") == true)
				{
					signIn.info.setText("帳號密碼不可為空!");
					signIn.signInPanel.add(signIn.info);
					signIn.signInLayeredPane.add(signIn.info, JLayeredPane.PALETTE_LAYER);
				}
				else
				{
					playName = account;
					
					signIn.info.setText("");
					int same = ConSignIn.SignIn(account, password);
					
					/*String Sql = "SELECT password FROM Gobang WHERE account = \'" + account + "\'";
					String pass = con.connect(Sql, "Q");
					if (password != null)
					{
						password = AES.encrypt(password);
					}*/
					
					if (same == 1)
					{
						gobangLayeredPane.remove(frame.playLayeredPane);
						gobangLayeredPane.removeAll();
						lobby.setframeLobby();
						gobangLayeredPane = lobby.lobbyLayeredPane;
						gobangFrame.setLayeredPane(gobangLayeredPane);
						gobangLayeredPane.revalidate();
						gobangLayeredPane.repaint();
						
						frame.playerName.setText(playName);
						
						signIn.account.setText("");
						signIn.password.setText("");
						signIn.info.setText("");
					}
					else if (same == 0)
					{
						signIn.info.setText("帳號或密碼錯誤!");
						signIn.signInPanel.add(signIn.info);
						signIn.signInLayeredPane.add(signIn.info, JLayeredPane.PALETTE_LAYER);
					}
					else
					{
						signIn.info.setText("無法登入此帳號!");
						signIn.signInPanel.add(signIn.info);
						signIn.signInLayeredPane.add(signIn.info, JLayeredPane.PALETTE_LAYER);
					}
				}
			}
		});
		
		lobby.waitButton.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{				
				int checkIn = logout(1);
				
				if (checkIn == 1)
				{
					gobangLayeredPane.remove(frame.playLayeredPane);
					gobangLayeredPane.removeAll();
					frame.setFrame();
					gobangLayeredPane = frame.playLayeredPane;
					gobangFrame.setLayeredPane(gobangLayeredPane);
					gobangLayeredPane.revalidate();
					gobangLayeredPane.repaint();
					
					if (player == 0)
					{
						ImageIcon blackSingle = new ImageIcon(blackSinglePath);
						frame.chess.setIcon(blackSingle);
					}
					else if (player == 1)
					{
						ImageIcon whiteSingle = new ImageIcon(whiteSinglePath);
						frame.chess.setIcon(whiteSingle);
					}
					
					local.place();
					Start();
				}
				/*else
				{
					lobby.wait.setText("配對失敗!!!");
					lobby.lobbyPanel.add(signUp.info);
					lobby.lobbyLayeredPane.add(lobby.wait, JLayeredPane.PALETTE_LAYER);
				}*/
			}
		});
		
		signUp.backSignIn.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e)
			{
				signUp.account.setText("");
				signUp.password.setText("");
				signUp.info.setText("");
				
				gobangLayeredPane.remove(signUp.signUpLayeredPane);
				gobangLayeredPane.removeAll();
				signIn.setframeSignIn();
				gobangLayeredPane = signIn.signInLayeredPane;
				gobangFrame.setLayeredPane(gobangLayeredPane);
				gobangLayeredPane.revalidate();
				gobangLayeredPane.repaint();
			}
		});
		
		signUp.send.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				String account = signUp.account.getText();
				String password = new String(signUp.password.getPassword());
				
				if (account.equals("") == true || password.equals("") == true)
				{
					signUp.info.setText("帳號密碼不可為空!");
					signUp.signUpPanel.add(signUp.info);
					signUp.signUpLayeredPane.add(signUp.info, JLayeredPane.PALETTE_LAYER);
				}
				else
				{
					int same = 0;
					
					same = ConSignUp.conSignUp(account, password);
					
					//System.out.println("same = " + same);
					
					if (same == 0)
					{
						signUp.account.setText("");
						signUp.password.setText("");
						signUp.info.setText("");
						
						gobangLayeredPane.remove(signUp.signUpLayeredPane);
						gobangLayeredPane.removeAll();
						signIn.setframeSignIn();
						gobangLayeredPane = signIn.signInLayeredPane;
						gobangFrame.setLayeredPane(gobangLayeredPane);
						gobangLayeredPane.revalidate();
						gobangLayeredPane.repaint();
					}
					else
					{
						signUp.info.setText("此帳號無法使用!!");
						signUp.signUpPanel.add(signUp.info);
						signUp.signUpLayeredPane.add(signUp.info, JLayeredPane.PALETTE_LAYER);
					}
				}
			}
		});
		
		msg.yes.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				//frame.logout.doClick();
				msg.msg.dispose();
				frame.logout.doClick();
				
				/*int logout = -1;
				//System.out.println("zero Or one == " + player);
				if (player == 0)
				{
					logout = ConPlay.restart();
					//try
					//{
						//Thread.sleep(3000);
					//}
					//catch(InterruptedException eer) { }
					msg.msg.dispose();
				}
				else if (player == 1)
				{
					//System.out.println("plplplplplapalpa === " + player);
					msg.msg.dispose();
					
					try
					{
						//while(true){
							ThreadClassConPlay thread1 = new ThreadClassConPlay();
							
							try
							{
								Thread.sleep(2000);
							}
							catch(InterruptedException er) { }
							
							thread1.start();
						//}
					}
					catch(Exception er){ }
					
					local.clean();
					Start();
				}
				
				//msg.msg.dispose();
				
				if (logout == 0)
				{
					local.clean();
					Start();
				}
				else if (logout == 1)
				{
					frame.logout.doClick();
				}*/
			}
		});
		
		/*msg.no.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				msg.msg.dispose();
			}
		});*/
		
		frame.clean.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				//msg.Info();
				
				int logout = -1;
				//System.out.println("zero Or one == " + player);
				if (player == 0)
				{
					logout = ConPlay.restart();
					/*try
					{
						Thread.sleep(3000);
					}
					catch(InterruptedException eer) { }*/
					//msg.msg.dispose();
				}
				else if (player == 1)
				{
					//System.out.println("plplplplplapalpa === " + player);
					//msg.msg.dispose();
					
					try
					{
						//while(true){
							ThreadClassConPlay thread1 = new ThreadClassConPlay();
							
							try
							{
								Thread.sleep(2000);
							}
							catch(InterruptedException er) { }
							
							thread1.start();
							
							try
							{
								thread1.join();
							}
							catch(InterruptedException er){ }
						//}
					}
					catch(Exception er){ }
					
					//local.clean();
					//Start();
				}
				
				//msg.msg.dispose();
				if (restartTimeOut == 0)
				{
					frame.timeOutMsg.setText("");
				}
				else if (restartTimeOut == 1)
				{
					frame.timeOutMsg.setText("對方無回應...");
					//frame.playPanel.add(frame.timeOutMsg);
					//frame.playLayeredPane.add(frame.timeOutMsg, JLayeredPane.MODAL_LAYER);
					restartTimeOut = 0;
					
					try
					{
						//while(true){
							ThreadClassTimeOut thread1 = new ThreadClassTimeOut();
							
							try
							{
								Thread.sleep(2000);
							}
							catch(InterruptedException er) { }
							
							thread1.start();
						//}
					}
					catch(Exception er){ }
				}
				
				if (logout == 0)
				{
					frame.timeOutMsg.setText("");
					local.clean();
					Start();
				}
				else if (logout == 2)
				{
					//System.out.println("0.0~~~~~~~");
					frame.timeOutMsg.setText("對方無回應...");
					try
					{
						//while(true){
							ThreadClassTimeOut thread1 = new ThreadClassTimeOut();
							
							try
							{
								Thread.sleep(2000);
							}
							catch(InterruptedException er) { }
							
							thread1.start();
						//}
					}
					catch(Exception er){ }
				}
				/*else if (logout == 1)
				{
					msg.Info();
					//frame.logout.doClick();
				}*/
			}
		});
		
		/*frame.back.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				if (start > 1 && stepBack == 0 && winner == 0)
				{
					stepBack = 1;
					start--;
					frame.round.setText("回合：" + Integer.toString(start));
					win[position[2]][position[3]] = -1;
					playerChange();
					local.StepBack();
				}
			}
		});*/
		
		frame.logout.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				logout(0);
				local.clean();
				conSignIn.conLogOut();
				
				gobangLayeredPane.remove(frame.playLayeredPane);
				gobangLayeredPane.removeAll();
				signIn.setframeSignIn();
				gobangLayeredPane = signIn.signInLayeredPane;
				gobangFrame.setLayeredPane(gobangLayeredPane);
				gobangLayeredPane.revalidate();
				gobangLayeredPane.repaint();
			}
		});
		
		lobby.logout.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{
				//logout();
				//local.clean();
				conSignIn.conLogOutNoPlay(playName);
				
				gobangLayeredPane.remove(lobby.lobbyLayeredPane);
				gobangLayeredPane.removeAll();
				signIn.setframeSignIn();
				gobangLayeredPane = signIn.signInLayeredPane;
				gobangFrame.setLayeredPane(gobangLayeredPane);
				gobangLayeredPane.revalidate();
				gobangLayeredPane.repaint();
			}
		});
		
		gobangFrame.addMouseListener(new MouseListener() {

			public void mousePressed(MouseEvent e) {
				if ((((start % 2 != 0) && player == 0)  || (start % 2 == 0) && player == 1) && in == 1)
				{
					if (e.getButton() == e.BUTTON1 && winner == 0)
					{
						getMouse(e.getX(), e.getY());
						//System.out.println(position[0] + " " + position[1]);
						
						win = local.location(position[0], position[1], player, win);
						/*for (int i = 0; i < 15; i++)
						{
							for (int j = 0; j < 15; j++)
							{
								System.out.print(win[j][i] + " ");
							}
							System.out.println();
						}*/
					}
					/*if (winner == 1 && restart == 0)
					{
						restart = 1;
						
						if (player == 0)
						{
							System.out.println("The winner is BLACK CHESS!!");
							ImageIcon black = new ImageIcon(frame.winPath);
							frame.blackMsg.setIcon(black);
							ImageIcon white = new ImageIcon(frame.losePath);
							frame.whiteMsg.setIcon(white);
						}
						else if (player == 1)
						{
							System.out.println("The winner is WHITE CHESS!!");
							ImageIcon white = new ImageIcon(frame.winPath);
							frame.whiteMsg.setIcon(white);
							ImageIcon black = new ImageIcon(frame.losePath);
							frame.blackMsg.setIcon(black);
						}
						ImageIcon turn = new ImageIcon(frame.readyPath);
						frame.Turn.setIcon(turn);
					}*/
					
					if (put == 1)
					{
						try
						{
							//while(true){
								ThreadClass thread1 = new ThreadClass(player, 0, position[0], position[1], win);
								
								/*try
								{
									Thread.sleep(3000);
								}
								catch(InterruptedException eer) { }*/
								
								thread1.start();
							//}
						}
						catch(Exception er){ }
						
						//win = conPlay.playClient(player, 0, position[0], position[1], win);
						
						if (winner == 0)
						{
							//System.out.println("start = " + start);
							playerChange();
							try
							{
								ThreadClass thread1 = new ThreadClass(player, 1, position[0], position[1], win);
								
								try
								{
									Thread.sleep(500);
								}
								catch(InterruptedException er) { }
								
								thread1.start();
							}
							catch(Exception er){ }
						}
						stepBack = 0;
					}
					
					if (winner == 1 && player == 0)
					{
						/*try
						{
							Thread.sleep(1000);
						}
						catch(InterruptedException eer) { }*/
						
						//frame.playPanel.add(frame.clean);
						//frame.playLayeredPane.add(frame.clean, JLayeredPane.PALETTE_LAYER);
					}
				}
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
	}
}
