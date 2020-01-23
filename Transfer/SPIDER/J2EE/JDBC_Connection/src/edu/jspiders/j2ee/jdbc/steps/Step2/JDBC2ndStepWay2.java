package edu.jspiders.j2ee.jdbc.steps.Step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC2ndStepWay2 {

	public static void main(String[] args)
	{
		Connection con= null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl= "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con= DriverManager.getConnection(dbUrl);
			System.out.println(con);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
