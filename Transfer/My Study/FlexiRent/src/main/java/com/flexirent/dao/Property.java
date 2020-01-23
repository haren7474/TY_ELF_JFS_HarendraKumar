package com.flexirent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flexirent.dto.PropertyDto;
import com.flexirent.dto.RentPropertyDto;
import com.flexirent.utility.DBConnection;


public class Property 
{
	static PreparedStatement statement = null;
	static Connection connection = DBConnection.getConnection();

	public static void addProperty(PropertyDto readAddPropertyDetails)
	{
		try {
			statement = connection.prepareStatement(
					"insert into property(propertyType, streetNumber, subUrb, numerOfBedrooms, lastMaintenanceDate, propertyId) VALUES(?, ?, ?, ?, ?, ?)");
			statement.setInt(1, readAddPropertyDetails.getPropertyType());
			statement.setString(2, readAddPropertyDetails.getStreetNumber());
			statement.setString(3, readAddPropertyDetails.getSubUrb());
			statement.setInt(4, readAddPropertyDetails.getNumerOfBedrooms());
			statement.setDate(5, RentProperty.convertToDateViaSqlDate(readAddPropertyDetails.getLastMaintenanceDate())); 
			statement.setString(6, readAddPropertyDetails.getPropertyId());
			statement.executeUpdate();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("Could not add property Failed ! - " + readAddPropertyDetails.getPropertyId() + readAddPropertyDetails.getNumerOfBedrooms());
		}
	}
	
	// To Fetch property status for given property id
	public static String getPropertyStatus(String propertyId) 
		{
			String propertyStatus = null;
			try {
				statement = connection.prepareStatement("SELECT propertyStatus FROM property WHERE propertyId = ?");
				statement.setString(1, propertyId);
				ResultSet propertyIdSet = statement.executeQuery();
				while (propertyIdSet.next()) {
					 propertyStatus = propertyIdSet.getString("propertyStatus");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Could Not Paste, try Again! - " + propertyId);
			}
			return propertyStatus;
		}

	public static void updatePropertyStatus(RentPropertyDto rpDto) 
	{
		try 
		{
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE property SET propertyStatus = ? WHERE propertyId = ?");
			
			statement.setString(1, rpDto.getPropertyStatus());
			statement.setString(2, rpDto.getPropertyId());
			statement.executeUpdate();
			
			System.out.println("Status of "+ rpDto.getPropertyId() + " has been updated to "+ rpDto.getPropertyStatus());
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - ");
		}
	}
	
	public static void displayAllProperties() 
	{
		try {

			System.out.println("-----List of all properties present in FlexiRent------------");
			System.out.println("propertyType\t\t numerOfBedrooms\t\t lastMaintenanceDate\t\t propertyId\t\t propertyStatus\t\t subUrb\t\t streetNumber");
			Connection connection = DBConnection.getConnection();

			// Displaying all the properties present in FlexiRent
			PreparedStatement statement = connection.prepareStatement(
					"select DISTINCT propertyType, numerOfBedrooms, lastMaintenanceDate, propertyId, propertyStatus,subUrb, streetNumber from property ORDER BY propertyType");

			ResultSet propertySet = statement.executeQuery();
			java.sql.ResultSetMetaData rsmd = propertySet.getMetaData();
			 int columnsNumber = rsmd.getColumnCount();
			   while (propertySet.next()) 
			   {
			       for (int i = 1; i <= columnsNumber; i++) {
			           if (i > 1) System.out.print("\t\t");
			           String columnValue = propertySet.getString(i);
			           
			           if(i==1 && columnValue.contains("0"))
			           {
			        	   columnValue="Apartment    ";			           
			           }
			           else if(i==1 && columnValue.contains("1"))
			           {
			        	   columnValue="Premium Suite";			           
			           }
			           System.out.print(columnValue + " ");
			       }
			       System.out.println("");
	}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
	}
	
	public static void displayVariousProperties(PropertyDto pDto) 
	{
		try {			
			
			Connection connection = DBConnection.getConnection();
			
			String tempStatus= pDto.getPropertyStatus();
			if(tempStatus.equals("%"))
			{
				tempStatus="ALL";
			}
			
			System.out.println("\n-----List of "+ tempStatus +" properties present in FlexiRent------------");
			System.out.println("propertyType  numerOfBedrooms \tlastMaintenanceDate\t\t propertyId\t\t\t propertyStatus\t\t subUrb\t\t streetNumber");
			
			// Displaying all the properties present in FlexiRent
			PreparedStatement statement = connection.prepareStatement(
					"select propertyType, numerOfBedrooms, lastMaintenanceDate, propertyId, propertyStatus,subUrb, streetNumber from property WHERE propertyStatus like ? ORDER BY propertyType");
			
			statement.setString(1, pDto.getPropertyStatus());
			ResultSet propertySet = statement.executeQuery();
			java.sql.ResultSetMetaData rsmd = propertySet.getMetaData();
			 int columnsNumber = rsmd.getColumnCount();
			   while (propertySet.next()) 
			   {
			       for (int i = 1; i <= columnsNumber; i++) 
			       {
			           if (i > 1) System.out.print("\t\t");
			           String columnValue = propertySet.getString(i);
			           
			           if(i==1 && columnValue.contains("0"))
			           {
			        	   columnValue="Apartment\t";			           
			           }
			           else if(i==1 && columnValue.contains("1"))
			           {
			        	   columnValue="Premium Suite";			           
			           }
			           System.out.print(columnValue + " ");
			       }
			       System.out.println("");
	}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
	}
	
	public static boolean isPropertyPresent(String propertyId) 
	{
		try {
			Connection connection = DBConnection.getConnection();

			// Checking if property is already present in system
			PreparedStatement statement = connection.prepareStatement(
					"select DISTINCT propertyId from property where propertyId=?");
			
			statement.setString(1, propertyId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) 
			{
				return true;
			}
			rs.previous();
			
			while (!rs.next()) 
			{
				return false;
			}

		} catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
		return false;
	}
}
