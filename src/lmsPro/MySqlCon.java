package lmsPro;
import java.sql.*;

public class MySqlCon 
{

	public static void main(String args[])
	{
		try 
		{
		String url="jdbc:mysql://localhost:3306/lms?verifyServerCertificate=false&useSSL=false";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from books");
		//hi this is kirti
		while(rs.next()) {
			String name=rs.getString("author");
			System.out.println(name);
		}
		
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
