import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.sql.*;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConSignUp
{
	public static int conSignUp(String acc, String pass)
	{
		ByteBuffer 	b = ByteBuffer.allocate(1000);
		String same = "0";
		
		try
		{
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect(new InetSocketAddress("127.0.0.1", 8887));
	
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
			
	        String data = acc + " " + pass;
	        
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
			same = new String(b.array(), 0, len);
			//System.out.println("Receive message : "	+ same);
	
			sc.close();
		}
		catch(IOException er)
		{
			//e.printStackTrace();
		}
		
		return Integer.parseInt(same);
	}
}
