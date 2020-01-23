package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			// Load the drive
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded");

			// Get the DBConnection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";

			System.out.println("Please enter userName");
			String dbUser = sc.nextLine();

			System.out.println("Please enter password");
			String dbPass = sc.nextLine();

			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("Connection Estd");

			// Issue the SQL Query via connection

			String query = "select * from user_info where userId=? and password=?";
			pstmt= conn.prepareStatement(query);

			System.out.println("Please enter userID");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			
			System.out.println("Please enter password");
			pstmt.setString(2, sc.nextLine());
			
			rs= pstmt.executeQuery();
			
			System.out.println("Query Issued");

			// Process the result returned by SQL

			if (rs.next()) {
				System.out.println("UserId\tUserName\tEmail\tPassword");
				
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			else
			{
				System.err.print("Something went wrong!!!!");
			}
		} 
		
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}

		finally 
		{
			// Close all JDBC objects
			try 
			{
				if (conn != null)
					conn.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}

			try 
			{
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}

			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}

		}

	}
}
