package com.tyss.finalvariable;

public class InstanceBlock 
{
	final int MAXIMUM;
	static final double PI;
	
	public InstanceBlock()
	{
		System.out.println("Constructor Executed");
	}
	
	public InstanceBlock(int a)
	{
		System.out.println("argumented Constructor Executed");
	}
	
	{
		System.out.println("Block Executed");
		this.MAXIMUM=3000;
	}
	
	static
	{
		System.out.println("This is a static block");
		PI=3.014;
	}
}
