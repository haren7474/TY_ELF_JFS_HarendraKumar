package hebbal.collections.CflPrograms.Ques04;

import java.util.LinkedList;

import hebbal.collections.CflPrograms.Ques03.Mobile;
import hebbal.collections.CflPrograms.Ques03.Student;

public class LinkedListQues
{
	public static void main(String[] args)
	{
		LinkedList l= new LinkedList();
		
		l.add(new Student(1, "Haren", 75));
		l.add(new Student(3, "Suren", 78));
		l.add(new Student(4, "Maren", 15));
		l.add(new Student(8, "Jiten", 80));
		l.add(new Student(2, "Naren", 33));

		l.add(new Mobile("Samsung", 25000));
		l.add(new Mobile("Nokia", 19000));
		l.add(new Mobile("OnePlus", 45000));
		l.add(new Mobile("Apple", 83101));

		for (Object obj : l)
		{
			System.out.println(obj);
		}
	}
}
