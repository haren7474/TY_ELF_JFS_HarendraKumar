package com.tyss.forestrymanagementsystemcollection.exception;

public class DateFromPastException extends RuntimeException
{
	private String msg;

	public DateFromPastException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
		
	}
}
