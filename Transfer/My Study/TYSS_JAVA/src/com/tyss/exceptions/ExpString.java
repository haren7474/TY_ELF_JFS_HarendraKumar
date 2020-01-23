package com.tyss.exceptions;

public class ExpString 
{
	public int getLength()
	{
		int len = 0;
		String str= null;
		try
		{
		System.out.println("try started");
		len= str.length();
		System.out.println("try ended");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Catch started");
			e.getMessage();
			System.out.println("Catch ended");
		}
		
		return len;
	
	}
	public static void main(String[] args) 
	{
		ExpString e= new ExpString();
		System.out.println("String Length "+e.getLength());
	}
}
