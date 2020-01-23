package hebbal.collections.MiniProjects.SMS;

import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);

	public static String readString() {
		return sc.next();
	}

	public static Integer readInteger() {
		return sc.nextInt();
	}

	public static void displayDashboard() {
		System.out.println("\n************Main Menu************\n*\t1. Add a student\t*\n*\t2. Remove Student\t*\n*\t"
				+ "3. Display All Students\t*\n*\t4. Search\t\t*\n*\t"
				+ "5. Update\t\t*\n*\t6. Sort\t\t\t*\n*\t7. Exit\t\t\t*\n*********************************\n");
	}

	public static void displayUpdateMenu() {
		System.out.println("\n****Menu for Update ****\n*  1. Update Name\t*\n*  2. Update Marks\t*\n*  "
				+ "3. Update Mobile#\t*\n*  4. Main Menu\t\t*\n*  5. Display Students\t*\n*"
				+ "  6. Exit\t\t*\n*************************\n");
	}

	public static void main(String[] args) {
		while (true) {
			displayDashboard();

			System.out.println("Please enter your choice");
			int choice = readInteger();

			switch (choice) {
			case 1:
				ArrayListStudent.addStudent();
				break;

			case 2:
				ArrayListStudent.removeStudent();
				break;

			case 3:
				ArrayListStudent.displayStudent();
				break;

			case 4:
				ArrayListStudent.searchStudent();
				break;

			case 5:
				// Checking if ArrayList if Empty
				if (ArrayListStudent.checkEmptyList()) 
				{ 
					break;
				} 
				else 
				{
					while (true) 
					{
						displayUpdateMenu();

						System.out.println("Please enter your choice for updation");
						int subChoice = readInteger();

						switch (subChoice) {
						case 1:
							ArrayListStudent.updateStudentDetails(subChoice);
							break;

						case 2:
							ArrayListStudent.updateStudentDetails(subChoice);
							break;

						case 3:
							ArrayListStudent.updateStudentDetails(subChoice);
							break;

						case 4:
							main(args);
							break;

						case 5:
							ArrayListStudent.displayStudent();
							break;
							
						case 6:
							System.exit(0);

						default:
							System.out.println("INVALID CHOICE");
							break;
						}
					}
				}
				
			case 6:
				ArrayListStudent.sortStudent();
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("INVALID CHOICE");
				break;
			}
		}

	}
}
