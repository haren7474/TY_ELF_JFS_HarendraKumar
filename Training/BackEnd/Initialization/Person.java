package com.tyss.Initialization;

public class Person 
{
	int age;
	String name;
	
	void personDetails()
	{
		System.out.println("Name is " + name + " and age is  "+ age);
	}
	
	void initialize(int a, String n)
	{
		age=a;
		name=n;
	}
}
