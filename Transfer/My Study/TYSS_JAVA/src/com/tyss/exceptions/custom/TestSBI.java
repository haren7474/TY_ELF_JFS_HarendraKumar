package com.tyss.exceptions.custom;

public class TestSBI {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		AtmSimulator as= new AtmSimulator();
		try
		{
			as.withdraw(42000);
		} catch(DayLimitException d)
		{
			System.out.println(d.getMessage());
		}
		
		System.out.println("MME");
	}

}
