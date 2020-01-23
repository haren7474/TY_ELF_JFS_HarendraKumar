package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUser 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.driver");
			System.out.println("Driver Loaded");

			// Get the DBConnection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter userId");
			String userid = sc.nextLine();

			System.out.println("Enter Password");
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, userid, password);

			System.out.println("Connection estbl....");

			// Issue the sql query
			String query = "update user_info set email=? where userid=? and password=?";
			pstmt = conn.prepareStatement(query);

			System.out.println("Enter New Email");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("Enter userId");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter Password");
			pstmt.setString(3, sc.nextLine());
			
			int res = pstmt.executeUpdate();

			// Process Result
			if (res > 0) 
			{
				System.out.println("Email Id Updated");
			} else {
				System.err.println("Something went wrong");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			
			sc.close();
			// Close all JDBC objects
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
