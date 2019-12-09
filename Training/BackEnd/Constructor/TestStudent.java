package com.tyss.Constructor;

public class TestStudent {

	public static void main(String[] args) 
	{
		Student s1= new Student();
		System.out.println("Name is"+ s1.studName + "Age is "+ s1.studAge);
		
		Student s2= new Student("Harendra", 26);
		System.out.println("Name is"+ s2.studName + "Age is "+ s2.studAge);
	}

}
