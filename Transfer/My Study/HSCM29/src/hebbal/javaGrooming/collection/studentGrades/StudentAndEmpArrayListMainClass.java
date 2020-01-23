package hebbal.javaGrooming.collection.studentGrades;

import java.util.ArrayList;

public class StudentAndEmpArrayListMainClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> l= new ArrayList<>();
	
		l.add(new Student("Haren", 1, 10.11, "CS"));
		l.add(new Student("Sakshi", 2, 20.11, "IS"));
		l.add(new Student("Keeth", 3, 37.11, "CS"));
		l.add(new Student("Nitin", 4, 76.11, "IT"));
		l.add(new Student("Jatin", 5, 80.11, "IT"));
		l.add(new Student("Aisha", 6, 50.11, "IS"));
		l.add(new Student("Vishnu", 7, 66.0, "CS"));
		l.add(new Student("Megha", 8, 18.8, "ET"));
		l.add(new Student("Shreya", 9, 45.0, "EC"));
		
	

		System.out.println("Name\t\tId\t\tMarks\t\tStream");
		
		System.out.println("------Print All Student------------");
		for (Student s : l) 
		{
			System.out.println(s);
		}
		
		System.out.println("------Only CS/IS/IT Student and having D-----------");
		for (Student s : l) 
		{
			if(s.getMarks()>75 && (s.getStream().equalsIgnoreCase("CS") || s.getStream().equalsIgnoreCase("IT") || s.getStream().equalsIgnoreCase("IS")))
			System.out.println(s);
		}
		
		System.out.println("------List with Updated Marks-----------");
		for (Student s : l) 
		{
			if(s.getMarks()>35 && s.getMarks()<=45)
			{
				s.setMarks(s.getMarks()*1.05 );
			}
			
			else if(s.getMarks()>45 && s.getMarks()<=60)
			{
				s.setMarks(s.getMarks()*1.03 );
			}
			
			else if(s.getMarks()>60 && s.getMarks()<=70)
			{
				s.setMarks(s.getMarks()*1.02 );
			}
		}
		
		for (Student s : l) 
		{
			System.out.println(s);
		}
		
		
		//SortStudent.sorting(l);
		//CountStudents.countDifferentStudent(l);
		DeleteStudents.deleteStudent(l);
	}
}
