package edu.spiders.java.practice.exception.atm;

public class BankTransaction
{
	public void checkBalance(double balAmt, double withdrawlAmt)
	{
		if(balAmt- withdrawlAmt>=0)
		{
			System.out.println("Transaction Successfull");
			System.out.println("Balance Left "+ (balAmt- withdrawlAmt));
		}
		else
		{
			try
			{
				throw new BankException("Low Balance");
			}
			catch (BankException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
