package com.tyss.fms.controller;

import java.util.Scanner;

import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.UserServices;

public class App {
	static Scanner sc = new Scanner(System.in);
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();

	public static void main(String[] args) {
		// Signing in....
		System.out.println("************Welcome to Forestry Management System***********");
		System.out.println("\nPlease Login with your credentials or contact FMS at +91 80 7893500/01");
		Integer checkId = null;
		int activeUserId;

		do {
			System.out.println("Enter Id : ");
			activeUserId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter password : ");
			String password = sc.nextLine();

			checkId = userServices.signIn(activeUserId, password);

			if (checkId != null) {
				System.out.println("<<<<<SignIn Successful with active ID: " + activeUserId + " and your role is: "+ userServices.getUserType(activeUserId)  + ">>>>>\n\n");
				break;
			}

			else
				System.out.println("\nWrong credentials. ");
		} while (checkId == null);

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
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	public static int dashBoardMenu() {
		System.out.println("***********DashBoard Menu***********");
		System.out.println("1. Manage User\n2. Manage Contract\n3. Manage Product\n4. Manage Land Data\n5. Exit");
		System.out.println("***********************************");
		System.out.println("Please enter your choice from DashBaord menu");
		int dashBoardChoice = sc.nextInt();
		sc.nextLine();
		return dashBoardChoice;
	}

}
