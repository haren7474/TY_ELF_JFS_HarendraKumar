package com.tyss.assgn3;

public class MethodOverridingOverloading extends Parent
{
	void getByk()
	{
		System.out.println("This is BMW byke");
	}
	
	void disp()
	{
		System.out.println("This is disp method, no argument");
	}
	
	void disp(String str)
	{
		System.out.println("This is disp with String: "+ str);
	}
}
