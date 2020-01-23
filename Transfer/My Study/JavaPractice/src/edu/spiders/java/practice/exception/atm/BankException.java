package edu.spiders.java.practice.exception.atm;

public class BankException extends RuntimeException
{
	private String msg;
	
	public BankException(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
	}
}
