package com.flexirent.application;

public class Menu 
{
	public static void displayMainMenu() 
	{
		String menu = "\nPlease Enter you choice\n";
		menu += "1. Sign up\n2. Sign in";
		System.out.println(menu);
	}

	public static void displayDashboard() 
	{
		String menu = "\nPlease Enter you choice\n";
		menu += "1. Add Property\n2. Rent Property\n3. Return Property\n"
				+ "4. Property Maintenance\n5. Complete Maintenance\n6. Display Properties\n7. Billing\n8. Exit Program";
		System.out.println(menu);
	}
	
	public static void displayAddProperty()
	{
		String menu = "\nPlease Enter you choice\n";
		menu += "1. Property Type\n2. Street Number\n3. Street Name\n4. Suburb\n5. Number of bedrooms";
		System.out.println(menu);
	}
	
	public static void displayPropertyTypes()
	{
		String menu = "\nPlease Enter you choice\n";
		menu += "1. Apartment\n2. Premium Suite";
		System.out.println(menu);
	}
	
	public static void displaySpecificPropertyDetailsWithGivenType()
	{
		String menu = "\nPlease Enter you choice\n";
		menu += "1. RENTED properties\n2. AVAILABLE properties\n3. MAINTINANCE properties\n4. Display ALL properties\n5. Navigate to Dashboard\n6. Exit";
		System.out.println(menu);
	}
}
