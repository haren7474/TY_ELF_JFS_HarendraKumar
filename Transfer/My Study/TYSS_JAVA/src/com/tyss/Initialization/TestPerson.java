package com.tyss.Initialization;

public class TestPerson 
{

	public static void main(String[] args) 
	{
		Person p1= new Person();
		p1.age=26;
		p1.name="Harendra";
		p1.personDetails();
		

		Person p2= new Person();
		p2.initialize(23, "Alia");
		p2.personDetails();

	}
}
