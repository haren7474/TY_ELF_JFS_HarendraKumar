package com.tyss.stringclass;

public class CustomImmutableClass 
{
	private String name;
	private int age;
	
	public CustomImmutableClass(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	
}
