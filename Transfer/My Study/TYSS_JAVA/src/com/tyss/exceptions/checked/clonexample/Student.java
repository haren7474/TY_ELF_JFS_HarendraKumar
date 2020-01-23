package com.tyss.exceptions.checked.clonexample;

public class Student implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}
