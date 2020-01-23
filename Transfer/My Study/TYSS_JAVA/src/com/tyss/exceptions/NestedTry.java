package com.tyss.exceptions;

public class NestedTry 
{
	void exception(int n, String s)
	{
		try
		{
			System.out.println(s.length());
			try
			{
				System.out.println(500/n);
			} catch (ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
			}
		}
		catch (NullPointerException ne)
		{
			System.out.println(ne.getMessage());
		}
	}
}
