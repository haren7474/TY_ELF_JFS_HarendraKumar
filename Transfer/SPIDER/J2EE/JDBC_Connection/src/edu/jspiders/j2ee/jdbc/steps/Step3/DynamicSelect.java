package edu.jspiders.j2ee.jdbc.steps.Step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicSelect 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		
		System.out.println("Please enter the id");
		int id= sc.nextInt();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="select * from politicians where id>?";
			pstmt= con.prepareStatement(query);
			
			//Logic to set the values
			pstmt.setInt(1, id);
			rs= pstmt.executeQuery();
			
			
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
