package com.tyss.forestrymanagementsystem_hibernate.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	static Scanner sc = new Scanner(System.in);

	public static boolean checkEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		Boolean bool = pat.matcher(email).matches();
		if (bool == true) {
			return true;
		} else {
			System.out.println("Incorrect Email, try again\n");
			return false;
		}
	}

	public static boolean isStringEmpty(String string) {
		Boolean isEmptyString = "".equals(string);
		if (isEmptyString == true) {
			System.out.println("Please enter proper details, it can't be empty.\n");
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkDateFormat(String s) {
		Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
		Matcher m = p.matcher(s);
		Boolean isValidFormat = (m.find() && m.group().equals(s));
		if (isValidFormat == true) {
			return true;
		} else {
			System.out.println("Incorrect date format, try again\n");
			return false;
		}
	}

	public static boolean checkNotNullUserId(Integer userId) {
		if (userId != null)
			return true;
		else
			return false;
	}

	public static String defineUserType() {
		String userType = null;
		char accountTypeChoice;
		do {
			System.out.println("A. Add Customer\nB. Add Haulier\nC. Add Admin\nD. Add Owner\nPlease enter category");
			accountTypeChoice = sc.next().charAt(0);
			sc.nextLine();
			if (accountTypeChoice == 'A' || accountTypeChoice == 'a')
				userType = "Customer";
			else if (accountTypeChoice == 'B' || accountTypeChoice == 'b')
				userType = "Haulier";
			else if (accountTypeChoice == 'C' || accountTypeChoice == 'c')
				userType = "Admin";
			else if (accountTypeChoice == 'D' || accountTypeChoice == 'd')
				userType = "Owner";
		} while (!(accountTypeChoice == 'A' || accountTypeChoice == 'a' || accountTypeChoice == 'B'
				|| accountTypeChoice == 'b' || accountTypeChoice == 'C' || accountTypeChoice == 'c'
				|| accountTypeChoice == 'D' || accountTypeChoice == 'd'));
		return userType;
	}

	public static boolean checkValidName(String name) {
		boolean isValidName = name.matches("[A-Z][a-z]*") && name.length() > 0 && name.length() <= 10;
		if (isValidName == true) {
			return true;
		} else {
			System.out.println("Name should have alphabets only, having length > 0 and <=10\ntry again\n");
			return false;
		}
	}

	public static boolean checkPostalCode(int postalCode) {
		if (postalCode >= 100000 && postalCode < 1000000) {
			return true;
		} else {
			System.out.println("Postal Code must be a 6 digit number, try again!!!!");
			return false;
		}
	}

	public static boolean checkValidPhone(String phone) {
		boolean isValidPhone = phone.matches("[7-9][0-9]{9}");
		if (isValidPhone) {
			return true;
		} else {
			System.out.println("Phone number must be 10 digits... Try again!!!!");
			return false;
		}
	}

	public static boolean checkValidPwd(String phone) {
		boolean isValidPwd = phone.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
		if (isValidPwd) {
			return true;
		} else {
			System.out.println("it should be 8 characters long\n"
					+ " it should contain a lower case character & an upper case characters\n"
					+ " there should be a specail character \n" + "there should be a digit");
			System.out.println("Try again with proper password!!!!!!\n");
			return false;
		}
	}
}
