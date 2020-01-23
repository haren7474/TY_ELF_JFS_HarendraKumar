package edu.jspiders.j2ee.jdbc.steps.Step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOtherThanSelect 
{
	public static void main(String[] args)
	{
		Statement stmt= null;
		Connection con = null;
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="update politicians set marks =60 where id=4 ";
			stmt= con.createStatement();
			
			int count= stmt.executeUpdate(query);
			System.out.println("No of rows affected: "+ count);

		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
