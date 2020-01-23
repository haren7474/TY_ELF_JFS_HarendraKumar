package com.tyss.Constructor;

public class TestGirlfriend 
{
	public static void main(String[] args) 
	{
		Girlfriend gf= new Girlfriend("Shree", "HP", 60000);
		
		System.out.println("Name is "+ gf.name);
		System.out.println("Company Name is " + gf.compName);
		System.out.println("Salary i: "+ gf.salary);
		
	}
}
