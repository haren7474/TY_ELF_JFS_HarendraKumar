package com.tyss.forestrymanagementsystemjpahiber.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;
import com.tyss.forestrymanagementsystemjpahiber.dto.LandBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemjpahiber.services.EmailServices;
import com.tyss.forestrymanagementsystemjpahiber.services.LandServices;

public class EmailIO {
	static EmailBean emailBean = null;
	static List<EmailBean> emailList = null;
	static EmailServices emailServices = ForestryManagementSystemFactory.instanceOfEmailServices();
	static LandServices landServices = ForestryManagementSystemFactory.instanceOfLandServices();
	static Scanner sc = new Scanner(System.in);

	public static void emailHandler(String userType) {
		while (true) {
			switch (emailMenu(userType)) {
			case 1:
				emailList = emailServices.getAllEmail();
				if (emailList.size() > 0) {
					System.out.println("landEmail_Id\temail_Sender emailTimestamp emailReceiever email_Text");
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					for (EmailBean emailBean : emailList) {
						System.out.println(emailBean);
					}
				} else {
					System.out.println("No Database for email record, please add new email");
				}
				break;

			case 2:
				emailList = emailServices.getAllEmail();
				if (emailList.size() > 0) {
					System.out.println("landEmail_Id\temail_Sender emailTimestamp emailReceiever email_Text");
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					for (EmailBean emailBean : emailList) {
						System.out.println(emailBean);
					}
				} else {
					System.out.println("No Database for email record, please add new email");
				}
				break;

			case 3:
				if (emailServices.sendEmail(readEmailDetails())) {
					System.out.println("New email record has been added");
				} else {
					System.err.println("Something went wrong, please try again");
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

	private static EmailBean readEmailDetails() {
		emailBean = new EmailBean();

		System.out.println(
				"Land_Id\tOwnrId  Land_Area_SqFt  Latitude  Longitude    LandCost LandTax Land_Disputed Tax_Due_Date  ");
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		List<LandBean> landList = landServices.getAllLandRecords();
		Date date = new Date();
		for (LandBean landBean : landList) {
			if (landBean.isLandDisputed()
					&& ((landBean.getDueDate().getTime() - date.getTime()) / (1000 * 3600 * 24)) < 30) {

				System.out.print(landBean);
				System.out.println("\tCritical Lands");
			} else {
				System.out.print(landBean);
				System.out.println("\tNormal Lands");
			}

		}

		System.out.println("Please enter LandId to send email: ");
		int landId = sc.nextInt();
		LandBean landBean = landServices.getLandById(landId);

		System.out.println("Please enter email text to be sent");
		sc.nextLine();
		String emailText = sc.nextLine();
		emailBean.setEmailText(emailText);

		emailBean.setEmailSender("schedular@fms.com");

		emailBean.setLandBean(landBean);

		return emailBean;
	}

	public static int emailMenu(String userType) {
		if (userType.equalsIgnoreCase("Scheduler")) {
			System.out.println("***********Email Menu***********");
			System.out.println(
					"1. Display All Email\n2. Get Email By Id\n3. Send new Email\n4. Go to Dashboard\n5. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Email Menu");
			int emailChoice = sc.nextInt();
			sc.nextLine();
			return emailChoice;
		} else {
			System.out.println("***********Email Menu***********");
			System.out.println("1. Display All Email\n2. Get Email By Id\n3. Go to Dashboard\n4. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Email Menu");
			int emailChoice = sc.nextInt();
			sc.nextLine();
			if (emailChoice == 1) {
				emailChoice = 1;
			} else if (emailChoice == 2) {
				emailChoice = 2;
			} else if (emailChoice == 3) {
				emailChoice = 4;
			} else if (emailChoice == 4) {
				emailChoice = 5;
			} else {

				emailChoice = -1;
			}
			return emailChoice;
		}
	}
}
