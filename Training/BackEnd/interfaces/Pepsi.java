package com.tyss.interfaces;

public class Pepsi implements Bottle
{

	@Override
	public void open() 
	{
		System.out.println("Pepsi is opened");
	}

	@Override
	public void drink() 
	{
		System.out.println("Drink Pepsi");
	}
	
}
