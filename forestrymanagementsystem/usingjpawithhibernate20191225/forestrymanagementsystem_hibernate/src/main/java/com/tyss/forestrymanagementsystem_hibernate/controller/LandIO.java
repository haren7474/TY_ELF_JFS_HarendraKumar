package com.tyss.forestrymanagementsystem_hibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystem_hibernate.dto.LandBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.LandServices;

public class LandIO {
	static LandBean landBean = null;
	static LandServices landServices = ForestryManagementSystemFactory.instanceOfLandServices();
	static List<LandBean> landList = null;
	static Scanner sc = new Scanner(System.in);

	public static void landHandler(String userType) {
		while (true) {
			switch (landMenu()) {
			case 1:
				if (userType.equalsIgnoreCase("Admin")) {
					if (landServices.addLandRecord(readLandDetails())) {
						System.out.println("New Land record has been added");
					} else {
						System.err.println("Something went wrong, please try again");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 2:
				if (userType.equalsIgnoreCase("Admin")) {
					System.out.println("Please enter Land Id");
					int landId = sc.nextInt();
					System.out.println("Please enter new Land Tax to be updated");
					double landTax = sc.nextDouble();
					if (landServices.updateLandRecord(landId, landTax)) {
						System.out.println(
								"Land with ID: " + landId + " has been updated with new Tax of dollars: " + landTax);
					} else {
						System.out.println("Land with ID: " + landId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 3:
				landList = landServices.getAllLandRecords();
				if (landList.size() > 0) {
					System.out.println(
							"Land_Id\tOwnrId  Land_Area_SqFt  Latitude  Longitude    LandCost LandTax Land_Disputed");
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					for (LandBean landBean : landList) {
						System.out.println(landBean);
					}
				} else {
					System.out.println("No Database for Land record, please add new land");
				}
				break;

			case 4:
				return;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	public static LandBean readLandDetails() 
	{
		landBean = new LandBean();
		landBean.setLandOwnerId(ContractIO.displayAllUsersGetIdInput("Owner"));
		System.out.println("Please enter Land Area in Square Feet");
		landBean.setLandAreaInSqFeet(sc.nextInt());
		sc.nextLine();
		System.out.println("Please enter Land Latitude");
		landBean.setLandLatitude(sc.nextLine());
		System.out.println("Please enter Land Longitude");
		landBean.setLandLongitude(sc.nextLine());
		System.out.println("Please enter Land Cost");
		landBean.setLandCost(sc.nextDouble());
		System.out.println("Please enter Land Tax ");
		landBean.setLandTax(sc.nextDouble());
		sc.nextLine();
		int disputeChoice;
		do {
			System.out.println("1. Non Disputed Land\n2. Disputed land\n\nPlease enter land type with 1 or 2");
			disputeChoice = sc.nextInt();
		} while (!(disputeChoice == 1 || disputeChoice == 2));
		boolean b = false;
		if (disputeChoice == 2)
			b = true;
		landBean.setLandDisputed(b);
		System.out.println();
		return landBean;
	}

	public static int landMenu() {
		System.out.println("***********Land Menu***********");
		System.out.println(
				"1. Add Land Record\n2. Update Land record\n3. Display All Land Records\n4. Go to Dashboard\n5. Exit");
		System.out.println("*********************************");
		System.out.println("Please enter your choice from Land Menu");
		int landChoice = sc.nextInt();
		sc.nextLine();
		return landChoice;
	}
}
