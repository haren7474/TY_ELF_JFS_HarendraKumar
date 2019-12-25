package com.tyss.forestrymanagementsystem_hibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystem_hibernate.dto.UserBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.UserServices;

public class UserIO {
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static List<UserBean> userList = null;
	static UserBean user = null;
	static Scanner sc = new Scanner(System.in);

	public static void userHandler(String userType) {
		while (true) {
			int userId;
			switch (userMenu(userType)) {
			case 1:
				userList = userServices.getAllUser();
				if (userList.size() > 0) {
					System.out.println("Id\tMobile \t\tName \tTown \t\tEmail \t\t User Type");
					System.out.println("---------------------------------------------------------------------");
					for (UserBean cust : userList) {
						System.out.println(cust);
					}
				} else {
					System.out.println("No Database for users, please add new user");
				}
				break;

			case 2:
				if (userType.equalsIgnoreCase("Admin")) {
					if (userServices.addUser(readUserDetails())) {
						System.out.println("New user has been added");
					} else {
						System.err.println("Incorrect Input, please try again.");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 3:
				if (userType.equalsIgnoreCase("Admin")) {
					System.out.println("Please enter user id for modification");
					userId = sc.nextInt();
					sc.nextLine();
					System.out.println("Please enter new Email Id to be updated");
					String email = sc.nextLine();
					if (userServices.modifyUser(userId, email)) {
						System.out.println("user with ID: " + userId + " has been updated with new email: " + email);
					} else {
						System.out.println("user with ID: " + userId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are applicable for admin only.");
				}
				break;

			case 4:
				if (userType.equalsIgnoreCase("Admin")) {
					System.out.println("Please enter user Id to be deleted");
					userId = sc.nextInt();
					if (userServices.deleteUser(userId)) {
						System.out.println("user with ID: " + userId + " has been deleted");
					} else {
						System.out.println("user with ID: " + userId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are applicable for admin only.");
				}
				break;

			case 5:
				return;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	public static UserBean readUserDetails() {
		user = new UserBean();
		String userType = Validation.defineUserType();

		user.setUserType(userType);

		String fullName;
		do {
			System.out.println("Please enter your Name");
			fullName = sc.nextLine();
			fullName = fullName.trim();
		} while (!Validation.checkValidName(fullName));
		user.setFullName(fullName);

		String streetAdd1;
		do {
			System.out.println("Please enter Street Add1");
			streetAdd1 = sc.nextLine();
		} while (Validation.isStringEmpty(streetAdd1));
		user.setStreetAdd1(streetAdd1);

		String streetAdd2;
		do {
			System.out.println("Please enter Street Add2");
			streetAdd2 = sc.nextLine();
		} while (Validation.isStringEmpty(streetAdd2));
		user.setStreetAdd2(streetAdd2);

		String town;
		do {
			System.out.println("Please enter Town");
			town = sc.nextLine();
		} while (Validation.isStringEmpty(town));
		user.setTown(town);

		int postalCode;
		do {
			System.out.println("Please enter 6 Digit Postal Code");
			postalCode = sc.nextInt();
			sc.nextLine();
		} while (!Validation.checkPostalCode(postalCode));
		user.setPostalCode(postalCode);

		String email;
		do {
			System.out.println("Please enter Email ");
			email = sc.nextLine();
		} while (!Validation.checkEmail(email));
		user.setEmail(email);

		String mobile;
		do {
			System.out.println("Please enter Mobile Number");
			mobile = sc.nextLine();
		} while (!Validation.checkValidPhone(mobile));
		user.setMobileNumber(mobile);

		String pwd;
		do {
			System.out.println("Please enter Password");
			pwd = sc.nextLine();
		} while (!Validation.checkValidPwd(pwd));
		user.setPassword(pwd);

		return user;
	}

	public static int userMenu(String userType) {
		System.out.println("***********User Menu***********");
		if (userType.equalsIgnoreCase("Admin")) {
			System.out.println(
					"1. Display All Users\n2. Add User\n3. Modify User\n4. Delete User\n5. Go to Dashboard\n6. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from User Menu");
			int userChoice = sc.nextInt();
			sc.nextLine();
			return userChoice;
		} else {
			System.out.println("1. Display All Users\n2. Go to Dashboard\n3. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from User Menu");
			int userChoice = sc.nextInt();
			sc.nextLine();
			if (userChoice == 1) {
				userChoice = 1;
			} else if (userChoice == 2) {
				userChoice = 5;
			} else if (userChoice == 3) {
				userChoice = 6;
			} else {
				userChoice = -1;
			}
			return userChoice;
		}
	}
}
