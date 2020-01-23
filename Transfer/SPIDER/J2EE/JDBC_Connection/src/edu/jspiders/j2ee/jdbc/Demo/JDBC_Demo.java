package edu.jspiders.j2ee.jdbc.Demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class JDBC_Demo 
{
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) 
	{
		

		try 
		{
			// Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			// Get the connection via driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=");

			// Issue SQL Queries via connection
			stmt = con.createStatement();

			rs = stmt.executeQuery("Select * from politicians");

			// Process the result
			System.out.println("Id\t\tFirstName\t\tMiddleName\t\tLastName\t\tMarks");
			
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3)
						+ "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));
			}
		}

		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		finally 
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if (rs != null) 
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if (rs != null) 
			{
				try 
				{
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void insert(JDBC_Demo j)
	{
		//PreparedStatement pr= new PreparedStatement(conn, catalog)
		j.getDetails();
	
	}
	
	public static JDBC_Demo getDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Id");
		int id= sc.nextInt();
		
		System.out.println("Please enter first name");
		String fname=  sc.next();
		
		System.out.println("Please enter middle name");
		String mname=  sc.next();
		
		System.out.println("Please enter last name");
		String lname=  sc.next();
		
		System.out.println("Please enter marks");
		double marks=  sc.nextDouble();
		
		return new JDBC_Demo();
	}
}
