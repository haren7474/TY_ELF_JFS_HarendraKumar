package com.capgemini.jdbc.controller;

import java.util.Scanner;

public class DashBoard {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		if (UserLogin.login()) {
			while (true) {
				int ch = mainMenu();
				switch (ch) {
				case 1:
					if (InsertUser.insert()) {
						System.out.println("User Inserted");
					} else {
						System.err.println("Something went wrong...");
					}

					break;

				case 2:
					if (DeleteUser.delete()) {
						System.out.println("User Deleted");
					} else {
						System.err.println("Something went wrong...Could not delete the user");
					}
					break;

				case 3:
					if (UpdateUser.update()) {
						System.out.println("User Updated with new email id");
					} else {
						System.err.println("Something went wrong...Could not update");
					}

					break;

				case 4:
					GetAllUsers.display();
					break;

				case 5:

					break;

				case 6:

					break;

				case 7:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice");

				}
			}

		}

		else

		{
			System.err.println("Something went wrong!!!!..............TRY AGAIN");
		}

	}

	public static int mainMenu() {
		System.out.println("-------------------------\n" + "1. Add User\n2. Delete User\n"
				+ "3. Update Email\n4. Get All Users\n5. To be done\n6. To be done"
				+ "\n7. Exit\n--------------------------");

		System.out.println("Please enter you choice");
		return sc.nextInt();
	}

}
