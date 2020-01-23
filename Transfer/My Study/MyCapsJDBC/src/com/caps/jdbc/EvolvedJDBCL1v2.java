package com.caps.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCL1v2 {

	public static void main(String[] args) 
	{
		FileReader reader = null;
		Properties prop = null;
		
		String query="select * from user_info";
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
	
		try 
		{
			reader = new FileReader("db1v2.properties");
			prop = new Properties();
			prop.load(reader);

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (
				Connection conn = DriverManager.getConnection(dbUrl, prop);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) 
		{
			while (rs.next()) 
			{
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
