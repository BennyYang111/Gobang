import java.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Connect
{
	public String connect(String Sql, String str) 
	{
		 try 
		 {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	         String url = "jdbc:sqlserver://LAPTOP-5FC3MHVF\\LYRICS:1433;databaseName=master;user=user;password=user";
	         
	         Connection conn = DriverManager.getConnection(url);
	         if (conn != null && !conn.isClosed())
	         {	
	        	 String password = null;
	        	 
	        	 //System.out.println("��Ʈw�s�u���զ��\�I");
	        	 PreparedStatement prep = conn.prepareStatement(Sql);
	        	 if (str.equals("U") == true)
	        	 {
	        		 prep.executeUpdate();
	        	 }
	        	 else if (str.equals("Q") == true)
	        	 {
	        		 Statement stmt = conn.createStatement();
	        		 
	        		 ResultSet rs = stmt.executeQuery(Sql);
	        		 
	        		 while (rs.next()) {
		        		 password = rs.getString("password");
	        		 }
	        		 rs.close();
	        	 }
	        	 conn.close();
	        	 
	        	 if (password != "")
	        	 {
	        		 return password;
	        	 }
	         }
	     }
	     catch(ClassNotFoundException e) {
	    	 System.out.println("�䤣���X�ʵ{�����O"); 
	         e.printStackTrace();
	     }
	     catch(SQLException e)
		 { 
	         e.printStackTrace();
	     }
		return "";
	}
}