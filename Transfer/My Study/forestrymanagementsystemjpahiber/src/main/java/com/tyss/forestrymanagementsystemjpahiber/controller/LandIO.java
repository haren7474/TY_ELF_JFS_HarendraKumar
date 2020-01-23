package com.tyss.forestrymanagementsystemjpahiber.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystemjpahiber.dto.LandBean;
import com.tyss.forestrymanagementsystemjpahiber.dto.UserBean;
import com.tyss.forestrymanagementsystemjpahiber.exception.DateFromPastException;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemjpahiber.services.LandServices;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServices;

public class LandIO {
	static LandBean landBean = null;
	static LandServices landServices = ForestryManagementSystemFactory.instanceOfLandServices();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static List<LandBean> landList = null;
	static Scanner sc = new Scanner(System.in);

	public static void landHandler(String userType) {
		while (true) {
			switch (landMenu(userType)) {
			case 1:
				landList = landServices.getAllLandRecords();
				if (landList.size() > 0) {
					System.out.println(
							"Land_Id\tOwnrId  Land_Area_SqFt  Latitude  Longitude    LandCost LandTax Land_Disputed Tax_Due_Date  ");
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					for (LandBean landBean : landList) {
						System.out.println(landBean);
					}
				} else {
					System.out.println("No Database for Land record, please add new land");
				}
				break;

			case 2:
				landList = landServices.getAllLandRecords();
				Date date = new Date();
				if (landList.size() > 0) {
					System.out.println(
							"Land_Id\tOwnrId  Land_Area_SqFt  Latitude  Longitude    LandCost LandTax Land_Disputed Tax_Due_Date");
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					for (LandBean landBean : landList) {
						// System.out.println((landBean.getDueDate().getTime() -
						// date.getTime())/(1000*3600*24));
						if (landBean.isLandDisputed()
								&& ((landBean.getDueDate().getTime() - date.getTime()) / (1000 * 3600 * 24)) < 30) {
							System.out.println(landBean);
						}
					}
				} else {
					System.out.println("No Database for Land record, or no critical land");
				}
				break;

			case 3:
				if (landServices.addLandRecord(readLandDetails())) {
					System.out.println("New Land record has been added");
				} else {
					System.err.println("Something went wrong, please try again");
				}

				break;

			case 4:
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

	public static LandBean readLandDetails() {
		landBean = new LandBean();

		int ownerId = ContractIO.displayAllUsersGetIdInput("LandOwner");
		UserBean userBean = userServices.getUserById(ownerId);
		landBean.setUserBean(userBean);

		System.out.println("Please enter Land Area in Square Feet");
		landBean.setLandAreaInSqFeet(sc.nextInt());
		sc.nextLine();
		System.out.println("Please enter Land Latitude");
		landBean.setLandLatitude(sc.nextLine());

		System.out.println("Please enter Land Longitude");
		landBean.setLandLongitude(sc.nextLine());

		System.out.println("Please enter Land Cost");
		landBean.setLandCost(sc.nextDouble());

		Date formattedDate = null;
		do {
			System.out.println("Please enter Tax Due Date in format YYYY-MM-DD");
			String date = sc.next();
			formattedDate = Validation.convertStringToDate(date);
		} while (formattedDate == null);

		Date currentDate = new Date();
		if (formattedDate.getTime() - currentDate.getTime() < 0) {
			try {
				landBean.setDueDate(null);
				throw new DateFromPastException("Due date can't be from past");
			} catch (DateFromPastException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} else {
			SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
			landBean.setDueDate(formattedDate);
		}

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

	public static int landMenu(String userType) {
		if (userType.equalsIgnoreCase("LandOwner") || userType.equalsIgnoreCase("Scheduler")) {
			System.out.println("***********Land Menu***********");
			System.out.println(
					"1. Display All Land Records\n2. Display Critical Land\n3. Add Land Record\n4. Update Land record\n5. Go to Dashboard\n6. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Land Menu");
			int landChoice = sc.nextInt();
			sc.nextLine();
			return landChoice;
		} else {

			System.out.println("***********Land Menu***********");
			System.out.println("1. Display All Land Records\n2. Display Critical Land\n3. Go to Dashboard\n4. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Land Menu");
			int landChoice = sc.nextInt();
			sc.nextLine();
			if (landChoice == 1) {
				landChoice = 1;
			} else if (landChoice == 2) {
				landChoice = 2;
			} else if (landChoice == 3) {
				landChoice = 5;
			} else if (landChoice == 4) {
				landChoice = 6;
			} else {

				landChoice = -1;
			}
			return landChoice;
		}
	}

}
