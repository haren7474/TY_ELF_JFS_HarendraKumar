package com.tyss.access.pack1;

public class Person 
{
	public String pName;
	static public int age;
	
	public Person(String pName, int age)
	{
		this.pName= pName;
		Person.age= age;
	}
	
	public void getName()
	{
		System.out.println("Person Name in Pack1 is "+ pName);
	}
	
	public static void getAge() 
	{
		System.out.println("Person age in Pack1 is "+ age);
	}
}
