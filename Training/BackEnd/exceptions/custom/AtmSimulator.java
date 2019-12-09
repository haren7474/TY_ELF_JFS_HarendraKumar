package com.tyss.exceptions.custom;

public class AtmSimulator
{
	void withdraw(double amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException("Insufficient Balance");
		}
	}
}
