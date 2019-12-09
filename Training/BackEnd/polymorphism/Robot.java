package com.tyss.polymorphism;

public class Robot implements Sound, Movement
{
	@Override
	public void move() 
	{
		System.out.println("Sound is overridden");
	}
}
