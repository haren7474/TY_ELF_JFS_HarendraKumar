package com.tyss.objectclass;

public class TestStudent {

	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Harendra");
		Student s2= new Student(2, "Sweta");
		
		System.out.println("Id\tName");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
		System.out.println("\n-------Roll No--------------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
