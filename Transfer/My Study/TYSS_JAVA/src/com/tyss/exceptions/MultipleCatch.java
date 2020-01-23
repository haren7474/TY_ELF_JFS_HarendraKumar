package com.tyss.exceptions;

public class MultipleCatch 
{
	void exceptionCheck(int a, String b)
	{
		try
		{
			System.out.println("Divide strat");
			System.out.println(500/a);
			System.out.println("Divide end");
			
			System.out.println("--------------------");
			
			System.out.println("Len Strat");
			System.out.println(b.length());
			System.out.println("Len End");
		}
		catch(ArithmeticException a1)
		{
			System.out.println(a1.getMessage());
			System.out.println("divide by zero error");
		}
		
		catch(NullPointerException a2)
		{
			System.out.println(a2.getMessage());
			System.out.println("NPE Exp");
		}
	}
}
