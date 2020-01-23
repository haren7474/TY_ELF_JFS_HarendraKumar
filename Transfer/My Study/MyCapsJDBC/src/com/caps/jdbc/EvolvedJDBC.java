package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class EvolvedJDBC 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("Enter User Name");
		String user= sc.nextLine();
		
		System.out.println("Enter Password");
		String password= sc.nextLine();
		String query= "select * from user_info";
		
		try(
			Connection conn= DriverManager.getConnection(dbUrl, user, password);	
				Statement stmt= conn.createStatement();
				ResultSet rs= stmt.executeQuery(query);	)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2)+ "\t" + rs.getString(3)+ "\t" + rs.getString(4));
			}
			sc.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
