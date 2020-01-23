package com.tyss.exceptions.Propogation;

public class GoogleMap 
{
	void findLocation(String str)
	{
		try
		{
		System.out.println(str.length());
		} 
		catch(NullPointerException n)
		{
			n.getMessage();
			System.out.println("Google User, please enter the location");
			throw n;
		}
	}
}
