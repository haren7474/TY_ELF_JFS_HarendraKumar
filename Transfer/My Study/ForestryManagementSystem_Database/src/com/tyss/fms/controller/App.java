package com.tyss.fms.controller;

import java.util.Scanner;

import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.UserServices;

public class App {
	static Scanner sc = new Scanner(System.in);
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();

	public static void main(String[] args) {
		// Signing in....
		System.out.println("\t\t\t\t\t    ************************************");
		System.out.println("\t\t\t\t************WELCOME TO FORESTRY MANAGEMENT SYSTEM***********");
		System.out.println("\t\t\t\t\t    ************************************");
		System.out.println("\nPlease Login with your credentials or contact FMS at +91 80 7893500/01");
		String checkPwd = null;
		String password;
		int activeUserId;

		do {
			System.out.println("Enter Id: ");
			activeUserId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter password: ");
			password = sc.nextLine();

			checkPwd = userServices.signIn(activeUserId, password);

			if (checkPwd != null && checkPwd.equals(password)) {
				System.out.println("<<<<<------------SignIn Successful with active ID: " + activeUserId
						+ " and your role is: " + userServices.getUserType(activeUserId) + "-------------->>>>>\n\n");
				break;
			}

			else
				System.out.println("\nWrong credentials. ");
		} while (!(checkPwd != null && checkPwd.equals(password)));

		// Show Dashboard
		while (true) {
			switch (dashBoardMenu()) {
			case 1:
				UserIO.userHandler(activeUserId);
				break;

			case 2:
				ContractIO.contractHandler(activeUserId);
				break;

			case 3:
				ProductIO.productHandler(activeUserId);
				break;

			case 4:
				LandIO.landHandler(activeUserId);
				break;

			case 5:
				BillingIO.billngHandler(activeUserId);
				break;

			case 6:
				main(args);

			case 7:
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
				"\t*\t1. Manage User\t\t*\n\t*\t2. Manage Contract\t*\n\t*\t3. Manage Product\t*\n\t*\t4. Manage Land Data\t*\n\t*\t5. Manage Billing\t*\n\t*\t6. Switch User Login\t*\n\t*\t7. Exit\t\t\t*");
		System.out.println("\t*********************************");
		System.out.println("Please enter your choice from DashBaord menu");
		int dashBoardChoice = sc.nextInt();
		sc.nextLine();
		return dashBoardChoice;
	}

}
