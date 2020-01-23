package com.tyss.accessmodifires;

public class PrivatePerson 
{
	private String name;
	
	PrivatePerson(String name)
	{
		this.name = name;
	}
	
	private String getName()
	{
		return name;
	}
}
