package com.tyss.interfaces;

abstract public class RobertBosh implements Toyota
{

	@Override
	public void design() 
	{
	System.out.println("Design is provided by RB.");	
	}

	@Override
	public void methodCheck() 
	{
		System.out.println("It is overridden");
		Toyota.super.methodCheck();
	}
}
