package com.tyss.assgn1;

public class Demo extends Test
{
	Demo()
	{
		super("Hello");
		System.out.println("This is child class no arg constructor");
	}
	
	Demo(int i)
	{
		this();
		System.out.println("This is child class arg constructor and value is "+ i);
	}
}
