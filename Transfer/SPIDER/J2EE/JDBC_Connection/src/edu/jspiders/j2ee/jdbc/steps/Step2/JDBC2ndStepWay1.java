package edu.jspiders.j2ee.jdbc.steps.Step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC2ndStepWay1 {

	public static void main(String[] args)
	{
		Connection con= null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl= "jdbc:mysql://localhost:3306/jdbcconnect?";
			con= DriverManager.getConnection(dbUrl, "root", "");
			System.out.println(con);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
