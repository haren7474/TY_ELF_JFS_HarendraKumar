package com.tyss.interfaces;

public class Robot implements Movement, Sound
{

	@Override
	public void talk() 
	{
		System.out.println("Robot is talking");
	}

	@Override
	public void move() 
	{
		System.out.println("Robot is walking");
	}
	
}
