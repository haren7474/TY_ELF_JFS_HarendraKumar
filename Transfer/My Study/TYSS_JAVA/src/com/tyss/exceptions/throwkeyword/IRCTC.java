package com.tyss.exceptions.throwkeyword;

public class IRCTC 
{
	void confirmTicket() throws ClassNotFoundException 
	{
		try 
		{
			Class.forName("com.tyss.exceptions.throwkeyword.PayTM");
			System.out.println("Ticket Confirm");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not Found Exception, ticket not confirm");
			throw e;
		}
	}
}
