package edu.jspiders.j2ee.jdbc.steps.Step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicOtherThanSelect 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt= null;
		
		System.out.println("Please enter id");
		int id= sc.nextInt();
		
		System.out.println("Please enter first Name");
		String firstName= sc.next();
		
		System.out.println("Please enter middle Name");
		String middleName= sc.next();
		
		System.out.println("Please enter Last Name");
		String lastName= sc.next();
		
		System.out.println("Please enter Marks");
		double marks=sc.nextDouble();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="insert into politicians values (?, ?, ?, ?, ?)";		
			pstmt= con.prepareStatement(query);
			
			//Setting the placeholder
			pstmt.setInt(1, id);
			pstmt.setString(2, firstName);
			pstmt.setString(3, middleName);
			pstmt.setString(4, lastName);
			pstmt.setDouble(5, marks);
			
			int count= pstmt.executeUpdate();
			System.out.println("Query OK, No of rows inserted is "+ 1);
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
