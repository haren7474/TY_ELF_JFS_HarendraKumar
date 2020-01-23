package com.flexirent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flexirent.utility.DBConnection;

public class RentalFeeAndPenalty 
{
	public static void getBookingDates()
	{
		try 
		{

			System.out.println("-----List of all properties for rental records in FlexiRent------------");
			System.out.println("bookingId\t\trentDate\t\texpectedReturnDate\t\tactualReturnDate");
			Connection connection = DBConnection.getConnection();

			// Displaying all the properties present in FlexiRent
			PreparedStatement statement = connection.prepareStatement(
					"select bookingId, rentDate, expectedReturnDate, actualReturnDate from rentProperty ORDER BY bookingId");

			ResultSet propertySet = statement.executeQuery();
			java.sql.ResultSetMetaData rsmd = propertySet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			
			while (propertySet.next()) 
			{
				for (int i = 1; i <= columnsNumber; i++) 
				{
					if (i > 1)
						System.out.print("\t\t");
					String columnValue = propertySet.getString(i);
					System.out.print(columnValue + " ");
				}
				System.out.println("");
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
	}
}
