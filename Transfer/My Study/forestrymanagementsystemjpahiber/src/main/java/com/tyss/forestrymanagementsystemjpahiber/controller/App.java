package com.tyss.forestrymanagementsystemjpahiber.controller;

import java.util.Scanner;

import com.tyss.forestrymanagementsystemjpahiber.dto.UserBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServices;

public class App {
	static Scanner sc = new Scanner(System.in);
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();

	public static void main(String[] args) {
		// Signing in....
		System.out.println("\t\t\t\t\t    ************************************");
		System.out.println("\t\t\t\t************WELCOME TO FORESTRY MANAGEMENT SYSTEM***********");
		System.out.println("\t\t\t\t\t    ************************************");
		System.out.println("\nPlease Login with your credentials or contact FMS at +91 80 7893500/01");
		String password;
		int activeUserId;
		UserBean user = null;

		do {
			System.out.println("Enter Id: ");
			activeUserId = Validation.readValidInteger();
			System.out.println("Enter password: ");
			password = sc.nextLine();

			user = userServices.signIn(activeUserId, password);

			if (user != null && !user.getEmail().isEmpty()) {
				System.out.println("<<<<<------------SignIn Successful, Welcome: " + user.getFullName() + " You are: "
						+ user.getUserType() + "-------------->>>>>\n\n");
				break;
			}

			else
				System.out.println("\nWrong credentials. ");
		} while (user == null || user.getEmail().isEmpty());

		// Show Dashboard
		while (true) {
			switch (dashBoardMenu()) {
			case 1:
				UserIO.userHandler(user.getUserType());
				break;

			case 2:
				ProductIO.productHandler(user.getUserType());
				break;

			case 3:
				ContractIO.contractHandler(user.getUserType());
				break;

			case 4:
				BillingIO.billngHandler(user.getUserType());
				break;

			case 5:
				LandIO.landHandler(user.getUserType());
				break;

			case 6:
				EmailIO.emailHandler(user.getUserType());
				break;

			case 7:
				main(args);

			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	public static int dashBoardMenu() {
		System.out.println("\t***********DashBoard Menu********");
		System.out.println(
				"\t*\t1. Manage User\t\t*\n\t*\t2. Manage Product\t*\n\t*\t3. Manage Contract\t*\n\t*\t4. Manage Billing Data\t*\n\t*\t5. Manage Land\t\t*\n\t*\t6. Manage Email for land"
						+ "*\n\t*\t7. Switch User Login\t*\n\t*\t8. Exit\t\t\t*");
		System.out.println("\t*********************************");
		System.out.println("Please enter your choice from DashBaord menu");
		int dashBoardChoice = Validation.readValidInteger();
		return dashBoardChoice;
	}

}
