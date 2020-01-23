package com.flexirent.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.flexirent.dto.RentPropertyDto;
import com.flexirent.utility.DBConnection;

public class RentProperty {
	static PreparedStatement statement = null;
	static Connection connection = DBConnection.getConnection();

	public static Date convertToDateViaSqlDate(LocalDate dateToConvert) {
		return java.sql.Date.valueOf(dateToConvert);
	}

	public static void rentYourProperty(RentPropertyDto readRentYourPropertyDetails) {
		try {
			statement = connection.prepareStatement(
					"insert into rentproperty(propertyId, customerId, rentDate, numberOfDays, expectedReturnDate ) VALUES(?, ?, ?, ?, ?)");
			statement.setString(1, readRentYourPropertyDetails.getPropertyId());
			statement.setString(2, readRentYourPropertyDetails.getCustomerId());
			statement.setDate(3, convertToDateViaSqlDate(readRentYourPropertyDetails.getRentDate()));
			statement.setInt(4, readRentYourPropertyDetails.getNumberOfDays());
			statement.setDate(5, convertToDateViaSqlDate(
					readRentYourPropertyDetails.getRentDate().plusDays(readRentYourPropertyDetails.getNumberOfDays())));
			statement.executeUpdate();

			// Updating status to Rented of given property
			Property.updatePropertyStatus(readRentYourPropertyDetails);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("Could not add property ! - " + readRentYourPropertyDetails.getPropertyId()
					+ readRentYourPropertyDetails.getNumberOfDays());
		}
	}

	public static void returnProperty(RentPropertyDto rpDto) {
		try {
			statement = connection.prepareStatement(
					"update property p, rentproperty rp Set p.propertyStatus ='available' , rp.actualReturnDate=? where p.propertyId= rp.propertyId and rp.bookingId=?");
			statement.setDate(1, convertToDateViaSqlDate(rpDto.getActualReturnDate()));
			statement.setInt(2, rpDto.getBookingId());
			statement.executeUpdate();

			System.out.println("Booking Id " + rpDto.getBookingId() + " has been marked completed with returned date "
					+ rpDto.getActualReturnDate());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not return property ! - " + rpDto.getBookingId());
		}
	}

	// to be changed
	public static void getBillingDetails() {
		try {

			System.out.println("-----List of all properties for rental records in FlexiRent------------");
			System.out.println("bookingId, rentDate, numberOfDays, actualReturnDate, customerId,          propertyId");
			Connection connection = DBConnection.getConnection();

			// Displaying all the properties present in FlexiRent
			PreparedStatement statement = connection.prepareStatement(
					"select bookingId, rentDate, numberOfDays, actualReturnDate, customerId, propertyId from rentProperty ORDER BY bookingId");

			ResultSet propertySet = statement.executeQuery();
			java.sql.ResultSetMetaData rsmd = propertySet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (propertySet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print("\t\t");
					String columnValue = propertySet.getString(i);
					System.out.print(columnValue + " ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
	}

	public static void displayRentReturnProprtyTable() {
		try {

			System.out.println("-----List of all properties for rental records in FlexiRent------------");
			System.out.println("bookingId\trentDate \t\tnumberOfDays \tcustomerId\t\t\t\tpropertyId");
			Connection connection = DBConnection.getConnection();

			// Displaying all the properties present in FlexiRent
			PreparedStatement statement = connection.prepareStatement(
					"select bookingId, rentDate, numberOfDays, customerId, propertyId from rentProperty where actualReturnDate IS NULL ORDER BY bookingId");

			ResultSet propertySet = statement.executeQuery();
			java.sql.ResultSetMetaData rsmd = propertySet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (propertySet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print("\t\t");
					String columnValue = propertySet.getString(i);
					System.out.print(columnValue + " ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
	}
}