package com.tyss.assgn1;

public class Test 
{
	Test()
	{
		System.out.println("This is super class, no arg constructor");
	}
	
	Test(String a)
	{
		this();
		System.out.println("This is super class, arg constructor which is: "+ a);
	}
}
