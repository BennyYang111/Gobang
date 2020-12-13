import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

public class ConPlay extends Main
{
	//Location local = new Location();
	
	public int[][] playClient(int player, int wait_place, int X, int Y, int[][] win)		//X, Y是滑鼠座標
	{
		String placePos = "";
		String logMsg = "";
		String tok = "";
		
		if (wait_place == 0)
		{
			try
			{
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress("127.0.0.1", 8889));
				
		        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
		        {
		            System.out.println("Loop count = " + loopcount);
		            try
		            {
		                Thread.sleep(1000);
		            }
		            catch (InterruptedException e) 
		            {
		                System.err.println(e);
		            }
		        }
				
		        String data = "";
		        if (player == 1) data = "Pplayer1" + " " + Integer.toString(X) + " " + Integer.toString(Y);
		        else if (player == 0) data = "Pplayer2" + " " + Integer.toString(X) + " " + Integer.toString(Y);
		        
		        
				ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
				sc.write(buffer);
		
				ByteBuffer 	b = ByteBuffer.allocate(1000); 
				int			len = sc.read(b);
				
				while(len == 0)
				{
					try 
					{
						Thread.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						System.err.println(e);
					}
					len = sc.read(b);
					
					/*if (len == 0)
					{
						buffer = ByteBuffer.wrap(data.getBytes());
						sc.write(buffer);
					}*/
				}
				
				//System.out.println("Receive message : "	+ new String(b.array(), 0, len));
				placePos = new String(b.array(), 0, len);
				
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			StringTokenizer str = new StringTokenizer(placePos, " ");
			
			if (player == 1) win = Main.local.location(Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()), 1, win);
			else if (player == 0) win = Main.local.location(Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()), 0, win);
			
			if (Main.winner == 1 && Main.restart == 0)
			{
				Main.restart = 1;
				//System.out.println("restart(place) == " + restart);
				
				if (player == 0)
				{
					//System.out.println("The winner is BLACK CHESS!!");
					ImageIcon black = new ImageIcon(Main.frame.winPath);
					Main.frame.blackMsg.setIcon(black);
					ImageIcon white = new ImageIcon(Main.frame.losePath);
					Main.frame.whiteMsg.setIcon(white);
				}
				else if (player == 1)
				{
					//System.out.println("The winner is WHITE CHESS!!");
					ImageIcon white = new ImageIcon(Main.frame.winPath);
					Main.frame.whiteMsg.setIcon(white);
					ImageIcon black = new ImageIcon(Main.frame.losePath);
					Main.frame.blackMsg.setIcon(black);
				}
				ImageIcon turn = new ImageIcon(Main.frame.readyPath);
				Main.frame.Turn.setIcon(turn);
				
				//if (Main.player == 0)
				//{
					Main.frame.playPanel.add(frame.clean);
					Main.frame.playLayeredPane.add(frame.clean, JLayeredPane.PALETTE_LAYER); 
				//}
				
				/*if (Main.player == 1)
				{
					try
					{
						//while(true){
							ThreadClassConPlay thread1 = new ThreadClassConPlay();
							
							try
							{
								Thread.sleep(3000);
							}
							catch(InterruptedException e) { }
							
							thread1.start();
						//}
					}
					catch(Exception er){ }
				}*/
			}
		}
		else if (wait_place == 1)
		{
			try
			{
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress("127.0.0.1", 8888));
				
		        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
		        {
		            System.out.println("Loop count = " + loopcount);
		            try 
		            {
		                Thread.sleep(1000);
		            }
		            catch (InterruptedException e) 
		            {
		                System.err.println(e);
		            }
		        }
				
		        String data = "";
		        //System.out.println("player  :::::::" + player);
		        
		        if (player == 1) data = "Wplayer1";
		        else if (player == 0) data = "Wplayer2";
		        
				ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
				sc.write(buffer);
		
				ByteBuffer 	b = ByteBuffer.allocate(1000); 
				int			len = sc.read(b);
				
				while(len == 0 && Main.winner == 0)
				{
					try 
					{
						Thread.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						System.err.println(e);
					}
					len = sc.read(b);
					
					//System.out.println("Receive message : "	+ new String(b.array(), 0, len));
					if (len == 0)
					{
						buffer = ByteBuffer.wrap(data.getBytes());
						sc.write(buffer);
					}
				}
				//System.out.println("Receive message : "	+ new String(b.array(), 0, len));
				placePos = new String(b.array(), 0, len);
				StringTokenizer str = new StringTokenizer(placePos, " ");
				logMsg = str.nextToken();
				tok = str.nextToken();
				
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			//System.out.println("logMsg : "	+ logMsg);
			//System.out.println("tok : "	+ tok);
			
			if (logMsg.equals("logout") != true)
			{
				//System.out.println("place position:: " + placePos);
				
				StringTokenizer str = new StringTokenizer(placePos, " ");
				
				if (player == 1) win = Main.local.location(Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()), 0, win);
				else if (player == 0) win = Main.local.location(Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()), 1, win);
				
				if (player == 1 && Main.put == 1)
				{
					ImageIcon turn = new ImageIcon(Main.frame.whiteTurnPath);
					Main.frame.Turn.setIcon(turn);
					Main.put = 0;
					if (Main.winner != 1) Main.start++;
					Main.frame.round.setText("回合：" + Integer.toString(Main.start));
				}
				else if (player == 0 && Main.put == 1)
				{
					ImageIcon turn = new ImageIcon(Main.frame.blackTurnPath);
					Main.frame.Turn.setIcon(turn);
					Main.put = 0;
					if (Main.winner != 1) Main.start++;
					Main.frame.round.setText("回合：" + Integer.toString(Main.start));
				}
				//Main.playerChange();
				
				if (Main.winner == 1 && Main.restart == 0)
				{
					Main.restart = 1;
					//System.out.println("restart(wait) == " + restart);
					
					if (player == 0)
					{
						//System.out.println("The winner is WHITE CHESS!!");
						ImageIcon white = new ImageIcon(Main.frame.winPath);
						Main.frame.whiteMsg.setIcon(white);
						ImageIcon black = new ImageIcon(Main.frame.losePath);
						Main.frame.blackMsg.setIcon(black);
					}
					else if (player == 1)
					{
						//System.out.println("The winner is BLACK CHESS!!");
						ImageIcon black = new ImageIcon(Main.frame.winPath);
						Main.frame.blackMsg.setIcon(black);
						ImageIcon white = new ImageIcon(Main.frame.losePath);
						Main.frame.whiteMsg.setIcon(white);
					}
					ImageIcon turn = new ImageIcon(Main.frame.readyPath);
					Main.frame.Turn.setIcon(turn);
					
					//if (Main.player == 0)
					//{
						Main.frame.playPanel.add(frame.clean);
						Main.frame.playLayeredPane.add(frame.clean, JLayeredPane.PALETTE_LAYER);
					//}
					/*else if (Main.player == 1)
					{
						try
						{
							//while(true){
								ThreadClassConPlay thread1 = new ThreadClassConPlay();
								
								try
								{
									Thread.sleep(3000);
								}
								catch(InterruptedException e) { }
								
								thread1.start();
							//}
						}
						catch(Exception er){ }
					}*/
				}
			}
			else if ((tok.equals("Wplayer1") == true && Main.player == 1) || tok.equals("Wplayer2") == true && Main.player == 0)
			{
				//System.out.println("??????tok::: " + tok);
				//Main.msg.restartMsg.setText(Main.playName + "已經登出!!");
				//Main.msg.msgPanel.add(msg.restartMsg);
				//Main.msg.msgLayeredPane.add(msg.restartMsg, JLayeredPane.PALETTE_LAYER);
				
				Main.msg.Info();
				//Main.frame.logout.doClick();
			}
		}
		return win;
	}
	
	public static int restart()
	{
		int wantLogout = 0;
		int waitTime = 0;
		
		try
		{
			try
			{
				SocketChannel sc = SocketChannel.open();
				sc.configureBlocking(false);
				sc.connect(new InetSocketAddress("127.0.0.1", 8889));
				
		        for (int loopcount = 0 ; !sc.finishConnect() ; loopcount++)
		        {
		            System.out.println("Loop count = " + loopcount);
		            try 
		            {
		                Thread.sleep(1000);
		            }
		            catch (InterruptedException e) 
		            {
		                System.err.println(e);
		            }
		        }
				
		        String data = "wantStart";
		        
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
						doSomething(1);
						//break;
					}
					else if (rev.equals("logOut") == true)
					{
						//System.out.println("logOutlogOutlogOutlogOutlogOut");
						doSomething(2);
						//break;
					}
					
					if (len == 0)
					{
						buffer = ByteBuffer.wrap(data.getBytes());
						sc.write(buffer);
					}
				}
				
				//System.out.println("Receive message : "	+ new String(b.array(), 0, len));
				
				if ((new String(b.array(), 0, len)).equals("logOut"))
				{
					wantLogout = 1;
				}
				if ((new String(b.array(), 0, len)).equals(""))
				{
					wantLogout = 2;
				}
				
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e){ }
		
		return wantLogout;
	}
	
	public static void doSomething(int choose)
	{
		if (choose == 1)
		{
			//Main.msg.yes.doClick();
			Main.frame.timeOutMsg.setText("");
			Main.local.clean();
			Main.Start();
		}
		else if (choose == 2)
		{
			Main.msg.Info();
			//Main.frame.logout.doClick();
		}
	}
}
