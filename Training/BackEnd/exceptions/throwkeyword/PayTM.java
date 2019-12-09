package com.tyss.exceptions.throwkeyword;

public class PayTM 
{
	IRCTC i1;

	public PayTM(IRCTC i1) 
	{
		this.i1 = i1;
	}
	
	void bookTicket()
	{
		try {
			i1.confirmTicket();
			System.out.println("Ticket Booked");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Ticket not Booked");
		}
	}
}
