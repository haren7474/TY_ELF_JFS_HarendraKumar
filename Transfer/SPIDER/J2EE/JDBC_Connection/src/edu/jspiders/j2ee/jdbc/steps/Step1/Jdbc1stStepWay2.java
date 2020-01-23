package edu.jspiders.j2ee.jdbc.steps.Step1;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Jdbc1stStepWay2 
{

	public static void main(String[] args) 
	{
		try
		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			Enumeration<Driver> enumr= DriverManager.getDrivers();
			while(enumr.hasMoreElements())
			{
				System.out.println(enumr.nextElement());
			}
		} 
		
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
