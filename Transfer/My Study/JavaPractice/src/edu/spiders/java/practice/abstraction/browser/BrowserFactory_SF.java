package edu.spiders.java.practice.abstraction.browser;

public class BrowserFactory_SF
{
	public void getBrowser(Chrome c)
	{
		c.start();
	}
	
	public void getBrowser(Opera o)
	{
		o.start();
	}
	
	public void getBrowser(Safari s)
	{
		s.start();
	}
}
