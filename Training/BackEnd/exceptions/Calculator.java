package com.tyss.exceptions;

public class Calculator 
{
	public void divide(int a, int b)
	{
		System.out.println("divide method starts");
		try
		{
			System.out.println(a/b); //Exception occured

			System.out.println("divide method ends");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
