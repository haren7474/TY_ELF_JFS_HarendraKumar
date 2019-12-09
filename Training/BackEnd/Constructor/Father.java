package com.tyss.Constructor;

public class Father {

	public Father() 
	{
		System.out.println("A");
	}
	
	public Father(String name, int age)
	{
		this();
		System.out.println("B");
	}

}
