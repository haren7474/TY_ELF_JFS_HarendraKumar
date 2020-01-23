package edu.jspiders.j2ee.jdbc.steps.Step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticSelect {
	public static void main(String[] args)
	{
		Statement stmt= null;
		Connection con = null;
		ResultSet rs= null;
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="select * from politicians";
			stmt= con.createStatement();
			
			rs= stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +"\t\t" + rs.getString(2)+ "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getDouble(5));
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
