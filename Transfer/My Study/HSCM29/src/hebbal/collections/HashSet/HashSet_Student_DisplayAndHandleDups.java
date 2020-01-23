package hebbal.collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Student_DisplayAndHandleDups {
	public static void main(String[] args) {

		Set<Student> s = new HashSet<Student>();

		s.add(new Student("Harendra", 1, 10.11));
		s.add(new Student("Mahendra", 2, 20.11));
		s.add(new Student("Priyaaaa", 3, 70.11));
		s.add(new Student("Sauravvv", 4, 40.11));
		s.add(new Student("Sakshiiii", 5, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));
		s.add(new Student("Aishwarya", 6, 50.11));

		Iterator<Student> itr = s.iterator();

		while (itr.hasNext()) 
		{
			Student std = itr.next();
			System.out.println("HashCoe of "+ std.getName() + " is " + std.hashCode()
				+ "\tand Hashcode of HashSet:" + s.hashCode());

		}
	}
}
