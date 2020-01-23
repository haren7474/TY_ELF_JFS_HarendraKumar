package com.tyss.collectionframework.lists.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class TestStudent 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, "Haren", 89.5));
		al.add(new Student(1, "Jatin", 56.6));
		al.add(new Student(3, "Sumit", 78));

		while (true) 
		{
			int ch= mainMenu();
			switch (ch) 
			{
			case 1:
				al.add(readStudent());
				break;

				
			case 2:
				if (al.size() > 0) 
				{
					System.out.println("Please enter Student Id to be deleted");
					Student s = removeStudent(sc.nextInt(), al);
					if (s != null) {
						System.out.println("Below Student has been removed");
						System.out.println(s);
					} else {
						System.out.println("No such Id present");
					}

				} else
					System.out.println("Empty Database");
				break;

				
			case 3:
				if (al.size() > 0) 
				{
					System.out.println("Please enter Student Id to search");
					Student s = searchStudent(sc.nextInt(), al);
					if (s != null)
						System.out.println(s);
					else {
						System.out.println("No such Id present");
					}
				} else
					System.out.println("Empty Database");
				break;
				
			case 4:
				if (al.size() > 0) 
				{
					System.out.println("ID\t\tNAME\t\tMARKS");
					displayStudent(al);
				} else
					System.out.println("Empty Database");

				break;
				
				
			case 5:
				if (al.size() > 0) 
				{
					
				System.out.println("Sorting with ID: Press 1\nSorting with Name: Press 2");
				int sortChoice= sc.nextInt();
				if(sortChoice==1)
				{
					Collections.sort(al);
					System.out.println("ID\t\tNAME\t\tMARKS");
					displayStudent(al);
				}
				else if (sortChoice==2)
				{
					Collections.sort(al, new Student());
					System.out.println("ID\t\tNAME\t\tMARKS");
					displayStudent(al);
				}
				
				} else
				System.out.println("Empty Database");
				break;
				
				
			case 6:
				if (al.size() > 0) 
				{
					double marks=0.0;
					System.out.println("Please enter Student Id to be updated");
					int id=sc.nextInt();
					
					System.out.println("Please enter marks to be updated");
					do
					{
					try
					{
						marks= sc.nextDouble();
						checkMarks(marks);
					} 
					catch(LimitMarksException e)
					{
						System.out.println(e.getMessage());
					}
					} while(marks<0 || marks>100);	
					
					Student s = updateStudentMarks(id, al, marks);
					if (s != null) 
					{
						System.out.println("Below Student marks has been updated");
						System.out.println(s);
					} else {
						System.out.println("No such Id present");
					}

				} else
					System.out.println("Empty Database");
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");

			}
		}

	}

	public static Student readStudent() 
	{
		System.out.println("Please enter id");
		int id = sc.nextInt();

		System.out.println("Please enter name");
		String name = sc.next();

		System.out.println("Please eneter marks");
		double marks = sc.nextDouble();

		return new Student(id, name, marks);
	}

	public static void displayStudent(ArrayList<Student> al) {
		ListIterator<Student> itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static Student searchStudent(int id, ArrayList<Student> al)
	{
		Student s = null;
		ListIterator<Student> itr = al.listIterator();

		while (itr.hasNext()) {
			Student std = itr.next();
			if (std.getId() == id)
			{
				s = std;
				break;
			}
		}
		return s;
	}

	public static Student removeStudent(int id, ArrayList<Student> al) 
	{
		Student s = null;
		ListIterator<Student> itr = al.listIterator();

		while (itr.hasNext()) {
			Student std = itr.next();
			if (std.getId() == id) 
			{
				s = std;
				al.remove(s);
				break;
			}
		}
		return s;
	}
	
	public static Student updateStudentMarks(int id, ArrayList<Student> al, double marks) 
	{
		Student s = null;
		ListIterator<Student> itr = al.listIterator();

		while (itr.hasNext()) 
		{
			Student std = itr.next();
			if (std.getId() == id) 
			{
				s=std;
				s.setMarks(marks);
				break;
			}
		}
		return s;
	}
	
	public static int mainMenu()
	{
		System.out.println("-------------------------\n" + "1. Add Student\n2. RemoveStudent\n"
				+ "3. Search Student\n4. Display all Students\n5. Sort Student\n6. Update Student" 
				+ "\n7. Exit\n--------------------------");

		System.out.println("Please enter you choice");
		return sc.nextInt();
	}
	
	public static void checkMarks(double marks)
	{
		if(marks<0 || marks >100)
		{
			throw new LimitMarksException("Marks should be between 0 to 100, enter again:");
		}
	}
}
