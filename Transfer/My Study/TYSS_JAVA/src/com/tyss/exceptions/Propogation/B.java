package com.tyss.exceptions.Propogation;

public class B {
	static void n()
	{
		
		try
		{
			C.m();
		} catch(ArithmeticException ae)
		{
			System.out.println("B Class: "+ ae.getMessage());
			//ae.printStackTrace();
			throw ae;
		}
	}
}
