package com.tyss.exceptions.custom;

public class DayLimitException extends RuntimeException
{
	String msg;

	public DayLimitException(String msg) 
	{
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
	}
	
}
