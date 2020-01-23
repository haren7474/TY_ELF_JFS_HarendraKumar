package hebbal.javaGrooming.collection.studentsubject;

import java.util.Scanner;

public class ReadData 
{
	static Scanner sc= new Scanner(System.in);
	
	public static Subject getData()
	{
		System.out.println("Please enter Student Id");
		int studId= sc.nextInt();
		
		System.out.println("Please enter Student Name");
		String studName= sc.next();
		
		System.out.println("Please enter Subject Id");
		int subId= sc.nextInt();
		
		System.out.println("Please enter Subject Name");
		String subName= sc.next();
		
		System.out.println("Please enter Marks");
		int subMarks= sc.nextInt();
		
		System.out.println("Please enter Semester");
		int sem= sc.nextInt();
		
		return  new Subject(subId, subName, subMarks, studId, studName, sem, getGrade(subMarks));
	}
	
	public static String conKey(Subject s)
	{
		return s.getStudName()+"_"+ s.getSubName() + "_" + s.getSem();
	}
	
	public static char getGrade(int marks)
	{
		char grade='a';
		
		if(marks<40)
		grade='F';
		
		else if (marks<50)
		grade='D';
		
		else if (marks<60)
		grade='C';
		
		else if (marks<70)
		grade='B';
		
		else
		grade='A';
		
		return grade;
	}
}
