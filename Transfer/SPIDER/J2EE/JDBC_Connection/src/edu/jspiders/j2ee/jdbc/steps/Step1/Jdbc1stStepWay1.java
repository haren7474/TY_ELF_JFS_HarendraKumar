package edu.jspiders.j2ee.jdbc.steps.Step1;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class Jdbc1stStepWay1 {

	public static void main(String[] args) 
	{
		try
		{
			//Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			Enumeration<Driver> enumr= DriverManager.getDrivers();
			while(enumr.hasMoreElements())
			{
				System.out.println(enumr.nextElement());
			}
		} 
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
