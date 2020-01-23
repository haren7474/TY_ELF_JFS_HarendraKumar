package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Diver Loaded: " + driver);

			// Get DBConnection via Driver
			String dburl = "jdbc:mysql://localhost:3306/ty_cg_nov6?user=root&password=root";

			conn = DriverManager.getConnection(dburl);
			System.out.println("Connection Established: " + conn);

			// Issue SQL query via connection
			String query = "select * from user_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("Query Issued: " + rs + "\n");

			// Process the result returned
			System.out.println("UserId\tUserName\tEmail\tPassword");
			while (rs.next()) 
			{
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + 
						"\t" + rs.getString(4));
				System.out.println("------------------------------");
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();

		} finally 
			{
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
