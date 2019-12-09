package com.tyss.exceptions.Propogation;

public class Ola
{
	GoogleMap g1;

	public Ola(GoogleMap g1) 
	{
		this.g1 = g1;
	}
	
	void find(String str)
	{
		try
		{
			g1.findLocation(str);
		} 
		catch(NullPointerException a)
		{
			System.out.println("Ola User, Location has not been entered");
		}
	}
	
}
