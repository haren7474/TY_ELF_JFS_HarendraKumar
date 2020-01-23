package hebbal.collections.CflPrograms.Ques03;

import java.util.ArrayList;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(new Student(1, "Haren", 75));
		l.add(new Student(3, "Suren", 78));
		l.add(new Student(4, "Maren", 15));
		l.add(new Student(8, "Jiten", 80));
		l.add(new Student(2, "Naren", 33));

		l.add(new Mobile("Samsung", 25000));
		l.add(new Mobile("Nokia", 19000));
		l.add(new Mobile("OnePlus", 45000));
		l.add(new Mobile("Apple", 83101));

		System.out.println("Printing all Objects");
		for (Object o : l) {
			System.out.println(o);
		}

		System.out.println("\n\nPrinting all students");
		System.out.println("\nId\t\tName\t\tMarks");
		for (Object o : l) {
			if (o instanceof Student) {
				System.out.println(o);
			}
		}

		System.out.println("\n\nPrinting Even students and Mobile");
		System.out.println("\nId\t\tName\t\tMarks");
		for (Object o : l) {
			if (o instanceof Student) {
				Student s = (Student) o;
				if (s.getSid() % 2 == 0) {
					System.out.println(o);
				}
			}

			if (o instanceof Mobile) {
				Mobile m = (Mobile) o;
				if (m.getPrice() % 2 == 0) {
					System.out.println(o);
				}
			}
		}

		System.out.println("\n\nPrinting Even students with marks> 60");
		System.out.println("\nId\t\tName\t\tMarks");
		for (Object o : l) {
			if (o instanceof Student) {
				Student s = (Student) o;
				if (s.getMarks() > 60) {
					System.out.println(o);
				}
			}
		}

		System.out.println("\n\nPrinting Even students with marks> 65 and Name Starts with 'H'");
		System.out.println("\nId\t\tName\t\tMarks");
		for (Object o : l) {
			if (o instanceof Student) {
				Student s = (Student) o;
				if (s.getMarks() > 65 && s.getSname().startsWith("H")) {
					System.out.println(o);
				}
			}
		}
	}
}
