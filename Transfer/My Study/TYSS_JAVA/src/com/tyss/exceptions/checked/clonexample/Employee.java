package com.tyss.exceptions.checked.clonexample;

public class Employee implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}
