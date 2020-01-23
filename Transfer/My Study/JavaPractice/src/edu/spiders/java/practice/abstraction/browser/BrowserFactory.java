package edu.spiders.java.practice.abstraction.browser;

public class BrowserFactory 
{
	public Browser getBrowser(String s)
	{
		Browser b= null;
		
		if(s.equalsIgnoreCase("Chrome"))
		{
			b= new Chrome();
		}
		
		else if(s.equalsIgnoreCase("Opera"))
		{
			b= new Opera();
		}
		else
		{
			b= new Safari();
		}
		return b;	
	}
}
