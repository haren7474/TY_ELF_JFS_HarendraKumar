package edu.jspiders.j2ee.adminemployeemodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeAdminModule
{
	static Connection con = null;
	static PreparedStatement pstmt= null;
	static ResultSet rs= null;
	static Statement stmt= null;
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
		int choice =menu();
		switch(choice)
		{
		case 1: addEmployee();
				break;
			
		case 2: updateEmployee();
				break;
				
				
		case 3: displayEmployee();
				break;
				
		case 4: deleteEmployee();
				break;
				
		case 10: System.exit(0);	
				break;
				
		default: System.out.println("Invalid Choice");
				 break;
		
		}
		}
		
	}
	
	private static void deleteEmployee() 
	{
		System.out.println("Please enter CTC limit, emp having> this limit will be deleted");
		double givenCTC= sc.nextDouble();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="delete from employeeadminmodule where ctc> ?";
			pstmt= con.prepareStatement(query);
			pstmt.setDouble(1, givenCTC);
			
			int count= pstmt.executeUpdate();
			if(count==0)
			{
				System.out.println("No Such record found");
			}
			else
			{
			System.out.println("No of row deleted: "+ count + "\nUpdated database:\n");
			displayEmployee();
			}
			
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}

	private static void displayEmployee() 
	{
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="select * from employeeadminmodule";
			stmt= con.createStatement();
			
			rs= stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +"\t\t" + rs.getString(2)+ "\t\t" + rs.getString(3) + "\t\t" + rs.getDouble(4) + "\t\t" + rs.getInt(5));
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}

	private static void updateEmployee() 
	{
		System.out.println("Current Database");
		displayEmployee();
		System.out.println("Please enter emp Id to update its location");
		int eid= sc.nextInt();
		
		System.out.println("Please enter new Location");
		String newLocation= sc.next();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="update employeeadminmodule set location =? where id=?";
			pstmt= con.prepareStatement(query);
			pstmt.setString(1, newLocation);
			pstmt.setInt(2, eid);
			
			int count= pstmt.executeUpdate();
			if(count==0)
			{
				System.out.println("Employee Id is not present in Database");
			}
			else
			{
			System.out.println("\nUpdated database:\n");
			displayEmployee();
			}
		}
		
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	

	}
	
	private static void updateEmployee2() 
	{
		EmployeeDetails e= readUpdateDetails();
		int id= e.getId();
		//int column= e.g
		System.out.println("Current Database");
		displayEmployee();
		System.out.println("Please enter emp Id to update its location");
		int eid= sc.nextInt();
		
		System.out.println("Please enter new Location");
		String newLocation= sc.next();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="update employeeadminmodule set location =? where id=?";
			pstmt= con.prepareStatement(query);
			pstmt.setString(1, newLocation);
			pstmt.setInt(2, eid);
			
			int count= pstmt.executeUpdate();
			if(count==0)
			{
				System.out.println("Employee Id is not present in Database");
			}
			else
			{
			System.out.println("\nUpdated database:\n");
			displayEmployee();
			}
		}
		
		catch (ClassNotFoundException | SQLException f)
		{
			f.printStackTrace();
		}	

	}

	public static int menu()
	{
		System.out.println("1. Add an Employee\n2. Update Employee Detail\n3. View Employee\n4. Delete an Employee \n10. Exit");
		System.out.println("Please Enter your choice");
		return sc.nextInt();
	}
	
	public static void addEmployee()
	{
		EmployeeDetails ed= readAddEmpDetails();
		
		try
		{
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
		
			//Issue the SQL queries
			String query="insert into employeeadminmodule values (?, ?, ?, ?, ?)";		
			pstmt= con.prepareStatement(query);
			
			//Setting the placeholder
			pstmt.setInt(1, ed.getId());
			pstmt.setString(2, ed.getName());
			pstmt.setString(3, ed.getLocation());
			pstmt.setDouble(4, ed.getCtc());
			pstmt.setInt(5, ed.getEmptype());
			
			int count= pstmt.executeUpdate();
			System.out.println("Query OK, No of rows inserted is "+ 1);
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static EmployeeDetails readAddEmpDetails()
	{
		System.out.println("Please Enter Emp Id");
		int id= sc.nextInt();
		
		System.out.println("Please Enter Emp Name");
		String name= sc.next();
		
		System.out.println("Please Enter Emp Location");
		String location= sc.next();
		
		System.out.println("Please Enter Emp CTC");
		double ctc= sc.nextDouble();
		
		System.out.println("Please Enter Emp Type");
		int empType= sc.nextInt();
		
		return new EmployeeDetails(id, name, location, ctc, empType);
	}
	
	public static EmployeeDetails readUpdateDetails()
	{
		System.out.println("Please Enter Emp Id");
		int id= sc.nextInt();
		
		System.out.println("Enter the column name to be updated");
		String column= sc.next();
		String newValue= null;
		
		if(column.equalsIgnoreCase("Name"))
		{
			System.out.println("Enter new Name");
			newValue= sc.next();
		}
		
		else if(column.equalsIgnoreCase("Location"))
		{
			System.out.println("Enter new Location");
			newValue= sc.next();
		}
		
		else if(column.equalsIgnoreCase("CTC"))
		{
			System.out.println("Enter new CTC");
			newValue= sc.next();
		}
		return new EmployeeDetails(id, newValue, column);
	}
}
