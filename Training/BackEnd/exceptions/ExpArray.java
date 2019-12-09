package com.tyss.exceptions;

public class ExpArray 
{

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		int a[]= new int[2];
		a[0]=11;
		
		try
		{
		a[2]=13;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
		}
		System.out.println("MME");
	}
}
