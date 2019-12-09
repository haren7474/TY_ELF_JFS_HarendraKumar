package com.tyss.collectionframework.lists.practise;

public class LimitMarksException extends RuntimeException
{
	String message;
	
	public LimitMarksException(String message) 
	{
		this.message = message;
	}

	@Override
	public String getMessage() 
	{
		return this.message;
	}
}
