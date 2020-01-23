package hebbal.javaGrooming.collection.studentGrades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudent {
	static int choice;
	static Scanner sc = new Scanner(System.in);

	public static void sorting(ArrayList<Student> l) {
		System.out.println("Please enter your choice");
		System.out.println("1. Stream\n2. Marks");

		choice = sc.nextInt();

		Collections.sort(l);

		System.out.println("----Sorted List---------");
		for (Student student : l) {
			System.out.println(student);
		}
	}

}
