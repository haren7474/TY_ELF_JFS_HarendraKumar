package com.tyss.exceptions.custom.checked;

public class AgeLimitException extends Exception
{
	String msg;

	public AgeLimitException(String msg) 
	{
		this.msg = msg;
	}
	
	
	@Override
	public String getMessage() 
	{
		return msg;
	}
}
