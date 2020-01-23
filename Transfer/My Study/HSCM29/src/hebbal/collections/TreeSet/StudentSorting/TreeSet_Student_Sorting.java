package hebbal.collections.TreeSet.StudentSorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Student_Sorting {
	public static void main(String[] args) {

		Set<Student> s = new TreeSet<Student>(new ImplementsComparator());

		s.add(new Student("Harendra", 1, 10.11));
		s.add(new Student("Mahendra", 2, 20.11));
		s.add(new Student("Surendra", 3, 70.11));
		s.add(new Student("Saurav K", 4, 40.11));
		s.add(new Student("Sakshi S", 5, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));

		Iterator<Student> itr = s.iterator();

		System.out.println("-----Cso using Comparator-----");
		System.out.println("Name\t\t\tId\t\tMarks");
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n\n-----DNso using Comparable-----");
		Set<Student> s1 = new TreeSet<Student>();

		s1.add(new Student("Dileep", 1, 10.11));
		s1.add(new Student("Jatin", 2, 20.11));
		s1.add(new Student("Nitin", 3, 70.11));
		s1.add(new Student("Pratap", 4, 40.11));
		s1.add(new Student("Suman", 5, 50.11));
		s1.add(new Student("Aisha", 6, 50.11));
		s1.add(new Student("Aisha", 6, 50.11));
		s1.add(new Student("Aisha", 6, 50.11));
		
		Iterator<Student>itr1 = s1.iterator();
		System.out.println("Name\t\tId\t\tMarks");
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
	}
}
