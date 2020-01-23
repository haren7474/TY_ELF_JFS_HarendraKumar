package hebbal.javaGrooming.collection.studentGrades;

import java.util.ArrayList;

public class CountStudents {

	public static void countDifferentStudent(ArrayList<Student> l) {
		int dist = 0, first = 0, second = 0;
		for (Student s : l) {
			if (s.getMarks() >= 75) {
				dist++;
			}

			else if (s.getMarks() >= 60) {
				first++;
			}

			else if (s.getMarks() >= 45) {
				second++;
			}
		}

		System.out.println("\n\nCategory\tCount");
		System.out.println("Distincion:\t" + dist);
		System.out.println("First:\t\t" + first);
		System.out.println("Second:\t\t" + second);
	}
}
