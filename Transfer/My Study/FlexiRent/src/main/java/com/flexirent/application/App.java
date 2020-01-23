package com.flexirent.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.flexirent.dao.Property;
import com.flexirent.dao.User;
import com.flexirent.dto.PropertyDto;
import com.flexirent.dto.RentPropertyDto;
import com.flexirent.dto.UserDto;
import com.flexirent.dao.RentProperty;
import com.flexirent.dao.RentalFeeAndPenalty;
import com.flexirent.utility.Validation;

public class App {
	static Scanner scanner = new Scanner(System.in);
	static Random rand = new Random();

	public static String readStringInput() {
		return scanner.nextLine();
	}

	public static Integer readIntegerInput() {
		Integer choice = null;
		try {
			choice = scanner.nextInt();
			scanner.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Invalid Input.. try again");
		}
		return choice;
	}

	public static void main(String[] args) 
	{
		Integer choice = 0;
		Menu.displayMainMenu();
		choice = readIntegerInput();
		Integer userId = null;

		switch (choice) {
		case 1:
			// ******* Sign Up***********
			UserDto uDto = readSignUpDetails();
			User.signUp(uDto);

			System.out.println("Signup Complete ! - Username:" + uDto.getUsername());
			break;

		case 2:
			do {
				uDto = readSignInDetails();
				userId = User.signIn(uDto);

				if (userId != null) {
					System.out.println("*******SignIn Successful*******" + "\nActive User: " + uDto.getUsername());
					break;
				}

				else
					System.out.println("\nWrong credentials. ");
			} while (userId == null);
			break;

		default:
			System.out.print("Not yet implemented !");
			break;
		}

		// ---------------If Sign In is successful-------------------------------
		choice = 0;
		while (true) // to Display dashboard again and again.
		{
			System.out.print("\n");
			Menu.displayDashboard();
			choice = readIntegerInput();

			switch (choice) {

			case 1:
				// ----------Add Property-------------
				PropertyDto pDto = readAddPropertyDetails();
				Property.addProperty(pDto);

				System.out.println("propertyId :" + pDto.getPropertyId() + " has been added");
				break;

			case 2:
				// ----------Rent Property-------------
				RentPropertyDto rpDto = readRentYourPropertyDetails();

				if (rpDto == null)
					System.out.println("Property is not available for rent");
				else
					RentProperty.rentYourProperty(rpDto);
				break;

			case 3:
				// Return Property
				rpDto = readReturnProperty();

				if (rpDto == null)
					System.out.println("This property can't be returned as it is not rented ");
				else
				{
					RentProperty.returnProperty(rpDto);
					RentalFeeAndPenalty.getBookingDates();
				}
				break;

			case 4:
				// Update property status
				rpDto = readUpdatePropertyStatus();
				if (rpDto == null) {
				} else {
					Property.updatePropertyStatus(rpDto);
				}
				break;

			case 5:
				break;

			case 6:
				displayProperties();
				break;

			case 7:
				readBillingDetails();
				break;

			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	private static void readBillingDetails() {

	}

	public static UserDto readSignUpDetails() {
		System.out.println("\nEnter First Name : ");
		String firstName = null;
		do {
			firstName = readStringInput();
		} while (Validation.isStringEmpty(firstName));

		// *****Accepting Account Type********
		System.out.println("\nPlease Enter: \nFor Customer Account Press 0\nFor Admin Account Press 1\n");
		Integer type = null;
		do {
			type = readIntegerInput();
			if (type == 0 || type == 1) {
				break;
			} else
				System.out.println("\nPlease Enter 0 or 1 only");
		} while (type != (0 | 1));

		// *****Accepting EmailId Input and validating it!!*************
		System.out.println("\nEnter Email Id : ");
		String emailId = null;
		do {
			emailId = readStringInput();
		} while (!Validation.checkEmail(emailId));

		// *****Accepting User Name Input*************
		String userName = null;
		System.out.println("\nEnter User Name: ");
		do {
			userName = readStringInput();
		} while (Validation.isStringEmpty(userName));

		// *****Accepting password Input and validating it!!********
		String password = null;
		System.out.println("\nEnter password : ");

		do {
			password = readStringInput();
		} while (Validation.isStringEmpty(password));

		return new UserDto(firstName, type, emailId, userName, password);
	}

	public static UserDto readSignInDetails() {
		System.out.println("\nEnter username : ");
		String userName = readStringInput();
		System.out.println("\nEnter password : ");
		String password = readStringInput();

		return new UserDto(userName, password);
	}

	public static PropertyDto readAddPropertyDetails() {
		// *****Accepting Property Type********
		System.out.println("\nPlease Enter: \nFor Apartment Press 0\nFor Premium Suite 1\n");
		Integer propertyType = null;
		do {
			propertyType = readIntegerInput();
			if (propertyType == 0 || propertyType == 1) {
				break;
			}
			System.out.println("\nPlease Enter 0 or 1 only");
		} while (propertyType != (0 | 1));

		// *****Accepting Street Number********
		System.out.println("\nEnter Street Number : ");
		String streetNumber = null;
		do {
			streetNumber = readStringInput();
		} while (Validation.isStringEmpty(streetNumber));

		// *****Accepting Suburb********
		System.out.println("\nEnter Suburb : ");
		String subUrb = null;
		do {
			subUrb = readStringInput();
		} while (Validation.isStringEmpty(subUrb));

		// *****Accepting Number of rooms********
		Integer numerOfBedrooms = null;
		if (propertyType == 0) {
			System.out.println("\nPlease Enter: \nFor 1BHK Press 1\nFor 2 BHK Press 2\nFor 3 BHK Press 3\n");
			do {
				numerOfBedrooms = readIntegerInput();
				if (numerOfBedrooms == 1 || numerOfBedrooms == 2 || numerOfBedrooms == 3) {
					break;
				}
				System.out.println("\nPlease Enter 1, 2 or 3 only");
			} while (propertyType != (1 | 2 | 3));
		} else
			numerOfBedrooms = 3;

		// *****Accepting last maintenance date for Premium Suite********
		String lastMaintenanceDate = null;
		if (propertyType == 1) {
			System.out.println("\nEnter last maintenance date in YYYY-MM-DD Format : ");
			do {
				lastMaintenanceDate = readStringInput();
			} while (!Validation.checkDateFormat(lastMaintenanceDate));
		} else {
			lastMaintenanceDate = "2000-01-01";
		}

		// *****Genarating Property Id********
		String propertyId = null;
		if (propertyType == 0) {
			propertyId = "A_" + (rand.nextInt(498) + 1) + "_" + LocalDateTime.now();
		} else {
			propertyId = "S_" + (rand.nextInt(498) + 501) + "_" + LocalDateTime.now();
		}
		return new PropertyDto(propertyType, streetNumber, subUrb, numerOfBedrooms,
				convertDateToLocalDate(lastMaintenanceDate), propertyId);

	}

	public static RentPropertyDto readRentYourPropertyDetails() 
	{
		// Rent your property
		RentPropertyDto rpDto;
		Property.displayAllProperties();

		String propertyId = null;
		System.out.println("Please enter property Id for booking");

		do {
			propertyId = readStringInput();
			if (Property.isPropertyPresent(propertyId)) {
				break;
			} else
				System.out.println("\nIncorrect PropertyId!!!! Please enter correct property Id for booking");

		} while (!Property.isPropertyPresent(propertyId));

		String propertyStatus = Property.getPropertyStatus(propertyId);

		if (propertyStatus.equalsIgnoreCase("available")) {
			System.out.println("Please enter Customer First Name for booking");
			String custName = readStringInput();

			System.out.println("Please enter Rent Date for booking in format yyyy-MM-dd");
			String rentDateString = readStringInput();

			System.out.println("Please enter Number of days for booking");
			Integer numberOfDays = readIntegerInput();

			propertyStatus = "rented";

			rpDto = new RentPropertyDto(propertyId, generateCustomerId(custName),
					convertDateToLocalDate(rentDateString), numberOfDays, propertyStatus);
		}

		else {
			rpDto = null;
		}
		return rpDto;

	}

	private static LocalDate convertDateToLocalDate(String rentDateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(rentDateString, formatter);
	}

	private static String generateCustomerId(String custName) {
		return "CUST_" + rand.nextInt(1999 - 1001) + 1001 + "_" + custName + "_" + LocalDateTime.now().toLocalDate();
	}

	private static RentPropertyDto readReturnProperty() {
		RentPropertyDto rpDto;

		// Display all bookings from FlexiRent
		System.out.println("List of booking in FlexiRent");
		RentProperty.displayRentReturnProprtyTable();

		// Returning the property
		System.out.println("Please enter Booking Id to be returned");
		Integer bookingId = readIntegerInput();

		System.out.println("Please enter respective property Id");
		String propertyId = readStringInput();

		if (Property.getPropertyStatus(propertyId).equalsIgnoreCase("rented")) {
			System.out.println("Please enter actual return date of booking in format yyyy-MM-dd");
			String returnDateString = readStringInput();

			rpDto = new RentPropertyDto(bookingId, convertDateToLocalDate(returnDateString));
		} else {
			rpDto = null;
		}
		return rpDto;

	}

	private static RentPropertyDto readUpdatePropertyStatus() {
		RentPropertyDto rpDto = null;
		Property.displayAllProperties();

		System.out.println("Please enter property Id for which status needs to be updated:");
		String propertyId = readStringInput();

		if (Property.isPropertyPresent(propertyId)) {
			System.out.println("Plese enter your choice\n1. Set to Rented\n2. Set to Available\n3. Set to Maintinance");
			int newStatus = readIntegerInput();

			String propertyNewStatus = null;
			if (newStatus == 1) {
				propertyNewStatus = "rented";
			} else if (newStatus == 2) {
				propertyNewStatus = "available";
			} else if (newStatus == 3) {
				propertyNewStatus = "maintinance";
			}

			if (Property.getPropertyStatus(propertyId).equalsIgnoreCase(propertyNewStatus)) {
				System.out.println("Status can not be updated as it is already present as " + propertyNewStatus);
				rpDto = null;
			}

			else {
				rpDto = new RentPropertyDto(propertyId, propertyNewStatus);
			}
		} else {
			System.out.println("PropertyId: " + propertyId + "  is not present in Database");
			rpDto = null;
		}
		return rpDto;
	}

	private static void displayProperties() {
		while (true) {
			Integer choice;
			Menu.displaySpecificPropertyDetailsWithGivenType();
			choice = readIntegerInput();

			String propertyStatus = generatePropertyStatusFromStatusId(choice);

			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				Property.displayVariousProperties(new PropertyDto(propertyStatus));
			} else if (choice == 5) {
				return;
			} else if (choice == 6) {
				System.exit(0);
			} else
				System.out.println("Invalid choice");

		}

	}

	private static String generatePropertyStatusFromStatusId(Integer displaySpecificProperty) {
		String propertyStatus = null;

		if (displaySpecificProperty == 1) {
			propertyStatus = "rented";
		} else if (displaySpecificProperty == 2) {
			propertyStatus = "available";
		} else if (displaySpecificProperty == 3) {
			propertyStatus = "maintinance";
		} else if (displaySpecificProperty == 4) {
			propertyStatus = "%";
		} else if (displaySpecificProperty == 5) {
			propertyStatus = "returning";
		}
		return propertyStatus;
	}
}