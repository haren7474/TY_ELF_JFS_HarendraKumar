package com.tyss.exceptions.checked.clonexample;

public class TestStudentExp {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		Student s= new Student();
		
		try {
			Object o= s.clone();
			System.out.println("Object Created " + o);
			
			Class c1= Class.forName("com.tyss.exceptions.checked.clonexample.Student");
			System.out.println("Class name printed "+ c1);
		} 
		catch (CloneNotSupportedException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main Method Ended");
	}
}
