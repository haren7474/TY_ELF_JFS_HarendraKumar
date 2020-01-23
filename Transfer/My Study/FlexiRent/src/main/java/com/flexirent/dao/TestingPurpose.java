package com.flexirent.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.flexirent.application.App;

public class TestingPurpose {

	public static void main(String[] args) 
	{
		System.out.println("Please enter Rent Date for booking in format yyyy-MM-dd");
		String rentDateString= App.readStringInput();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");				
		LocalDate rentDate = LocalDate.parse(rentDateString, formatter);
		System.out.println(rentDate);
		
		System.out.println(LocalDateTime.now());
		
	}
}
		