package com.tyss.exceptions.throwkeyword;

public class User {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		
		IRCTC i1= new IRCTC();
		PayTM p= new PayTM(i1);
		
		p.bookTicket();
		
		System.out.println("MME");
	}

}
