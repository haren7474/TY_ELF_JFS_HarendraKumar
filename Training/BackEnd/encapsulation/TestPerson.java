package com.tyss.encapsulation;

public class TestPerson {

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setAge(18);
		p.setName("Jatin");	
		System.out.println("Age is: "+ p.getAge() + "\nName is: " + p.getName());
	}
}
                                          