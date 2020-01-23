package com.tyss.assgn1;

public class AssignmentConstructor 
{
	//There are three ways to initialize non static variable of class in java.
	//1. Using Reference Variable 2. Using Mthods 3. Using Constructure.
	
	String name;
	int age;
	double salary;
	
	//Using Constructor
	public AssignmentConstructor(String name, int age, double salary) 
	{
		System.out.println("This is an argumented constuctor");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//Using Method
	void initialize(String n, int a, double s)
	{
		System.out.println("It is a method");
		name=n;
		age=a;
		salary=s;
	}
	
	public AssignmentConstructor() 
	{
		System.out.println("This is a non argument constuctor");
	}
	
}
