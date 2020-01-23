package com.tyss.exceptions.throwkeyword;

public class A {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		
		try {
			B.m();
			System.out.println("Success in A Class");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class not found in A");
		}
		System.out.println("MME");
	}
}
