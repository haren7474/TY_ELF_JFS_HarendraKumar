package com.tyss.fms.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.fms.dto.UserBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.UserServices;

public class UserIO {
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static List<UserBean> userList = null;
	static UserBean user = null;
	static Scanner sc = new Scanner(System.in);

	public static void userHandler(int activeUserId) {
		while (true) {
			String userType = userServices.getUserType(activeUserId);
			int userId;
			switch (userMenu()) {
			case 1:
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

			case 2:
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

			case 3:
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

			case 4:
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
		System.out.println("Please enter Full Name");
		user.setFullName(sc.nextLine());
		System.out.println("Please enter Street Add1");
		user.setStreetAdd1(sc.nextLine());
		System.out.println("Please enter Street Add2");
		user.setStreetAdd2(sc.nextLine());
		System.out.println("Please enter Town");
		user.setTown(sc.nextLine());
		System.out.println("Please enter Postal Code");
		user.setPostalCode(sc.nextInt());
		sc.nextLine();
		String email;
		do {
			System.out.println("Please enter Email ");
			email = sc.nextLine();
		} while (!Validation.checkEmail(email));
		user.setEmail(email);

		System.out.println("Please enter Mobile Number");
		user.setMobileNumber(sc.nextLine());
		System.out.println("Please enter Password");
		user.setPassword(sc.nextLine());
		return user;
	}

	public static int userMenu() {
		System.out.println("***********User Menu***********");
		System.out.println(
				"1. Add User\n2. Modify User \n3. Delete User" + "\n4. Display All Users\n5. Go to Dashboard\n6. Exit");
		System.out.println("*********************************");
		System.out.println("Please enter your choice from User Menu");
		int userChoice = sc.nextInt();
		sc.nextLine();
		return userChoice;
	}
}
