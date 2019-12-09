package com.tyss.objectclass;

public class Person1 
{
	String name;

	public Person1(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable 
	{
		super.finalize();
		System.out.println("finalize method has been invoked");
	}
	
}
