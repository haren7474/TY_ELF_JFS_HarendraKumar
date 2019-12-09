package com.tyss.access.pack1;

public class Student 
{
	protected String stdName;
	
	protected Student(String stdName)
	{
		this.stdName=stdName;
	}
	
	protected void studName()
	{
		System.out.println("Super STudent Name is: " + stdName);
	}
}
