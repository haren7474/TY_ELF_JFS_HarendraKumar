package com.tyss.interfaces;

public class Fanta implements Bottle
{
	@Override
	public void open() 
	{
		System.out.println("Fanta is opened");
	}

	@Override
	public void drink() 
	{
		System.out.println("Drink Fanta");
	}
	
}
