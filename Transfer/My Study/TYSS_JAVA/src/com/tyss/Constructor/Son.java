package com.tyss.Constructor;

public class Son extends Father
{
	Son()
	{
		this(25);
		System.out.println("C");
	}
	
	Son(int age)
	{
		super("Harry", 23);
		System.out.println("D");
	}
}
