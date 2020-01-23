package com.tyss.exceptions.Propogation;

public class A {
	static void o()
	{
		try
		{
			B.n();
		} catch(ArithmeticException ae)
		{
			System.out.println("A Class: "+ ae.getMessage());
			//ae.printStackTrace();
		}
		
	}
}
