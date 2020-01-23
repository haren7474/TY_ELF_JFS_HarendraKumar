package hebbal.collections.MiniProjects.SMS;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudent 
{
	static List<Student> l = new ArrayList<Student>();

	//Adding a Student to the List with Method addStudent
	public static void addStudent() 
	{
		// Read Input Student Name
		System.out.println("Please enter Student name");
		String studName = MainClass.readString();

		// Read and validate Student Id(if already exists)
		System.out.println("Please enter Student Id");
		Integer studId = null;

		do {
			studId = MainClass.readInteger();
			if (!checkStudentIdExist(studId)) {
				break;
			}
			System.out.println("\nId alreadys exists, please enter another id");
		} while (checkStudentIdExist(studId));

		// Read Input Student Marks
		System.out.println("Please enter Student Marks");
		int studMarks = MainClass.readInteger();

		// Read Input Student Mobile#
		System.out.println("Please enter Student Mobile");
		String studMobile = MainClass.readString();

		// Using Add Menthod to add this to Student by passing above values
		l.add(new Student(studName, studId, studMarks, studMobile));
	}

	//Removing Student from the list by method removeStudent
	public static void removeStudent() 
	{
		// Checking if ArrayList if Empty
		if (checkEmptyList()) {
		}

		// If Array List is not empty Then:
		else 
		{
			// Display Student Database
			System.out.println("\nList of Student present in ArrayList");
			displayStudent();

			// Reading Student Id, which needs to be removed
			System.out.println("To Remove, Please enter Student Id");
			Integer studId = null;

			// Validating if entered Id is present or not
			do {
				studId = MainClass.readInteger();
				if (checkStudentIdExist(studId)) {
					break;
				}
				System.out.println("\nId not found, please enter an id from above list to remove");
			} while (!checkStudentIdExist(studId));

			// Removing the record for given studentId
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).getId() == studId) {
					System.out.println("-----Currently Removing------\n" + l.get(i));
					l.remove(l.get(i));
				}
			}

			// Displaying Updated Student List
			System.out.println("\n-----Updated List of Students------\n");
			displayStudent();
		}
	}

	// ---------Display All Students
	public static void displayStudent() {
		// Checking if ArrayList if Empty
		if (checkEmptyList()) {
		}

		else {
			System.out.println("Id\t\tMarks\t\tMobile\t\t\tName");
			System.out.println("---------------------------------------------------------");

			for (int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));
			}
		}
	}

	// --------------------------Search Student with Student
	// ID----------------------------------------------------
	public static void searchStudent() 
	{
		// Checking if ArrayList if Empty
		if (checkEmptyList()) {
		} else {
			System.out.println("To search, Please enter Student Id");
			Integer studId = null;

			do {
				studId = MainClass.readInteger();
				if (checkStudentIdExist(studId)) {
					break;
				}
				System.out.println("\nId not found, please try another id");
			} while (!checkStudentIdExist(studId));

			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).getId() == studId) {
					System.out.println("-----Student Search Result------\n" + l.get(i));
				}
			}
		}

	}

	//-------Update Student Details-----
	public static void updateStudentDetails(int subChoice) 
	{
		System.out.println("To Update, Please enter Student Id");
		Integer studId = null;

		do {
			studId = MainClass.readInteger();
			if (checkStudentIdExist(studId)) {
				break;
			}
			System.out.println("\nId not found, please try another id");
		} while (!checkStudentIdExist(studId));

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getId() == studId) {
				if (subChoice == 1) {
					String oldName = l.get(i).getName();

					System.out.println("Please enter new name");
					String newName = MainClass.readString();

					l.get(i).setName(newName);
					System.out.println("Id " + l.get(i).getId() + " has been updated from old name " + oldName
							+ " to new name: " + newName);
				} else if (subChoice == 2) {
					Integer oldMarks = l.get(i).getMarks();
					System.out.println("Please enter new marks");
					Integer newMarks = MainClass.readInteger();

					l.get(i).setMarks(newMarks);
					System.out.println(l.get(i).getName() + "'s marks has been updated from old marks " + oldMarks
							+ " with new marks " + newMarks);
				}

				if (subChoice == 3) {
					String oldMobile = l.get(i).getMobile();
					System.out.println("Please enter new mobile#");
					String newMobile = MainClass.readString();

					l.get(i).setMobile(newMobile);
					System.out.println(l.get(i).getName() + "'s Mobile# has been updated from old mobile " + oldMobile
							+ "to new mobile# " + newMobile);
				}
			}
		}
	}

	// -----Check If Student Id Already Exists-
	public static boolean checkStudentIdExist(Integer studId) {

		boolean b = false;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getId() == studId) {
				b = true;
			}
		}
		return b;
	}

	// Checking for empty ArrayList
	public static boolean checkEmptyList() {
		boolean b = false;
		if (l.size() == 0) {
			System.out.println("\nStudent data not found, Operation is not possible");
			b = true;
		} else
			b = false;

		return b;
	}

	public static void sortStudent() {
		// Checking if ArrayList if Empty
		if (checkEmptyList()) {
		} else {

			// l.sort(s);
		}

	}
}
