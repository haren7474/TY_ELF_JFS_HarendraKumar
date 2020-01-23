package com.tyss.polymorphism;

public interface Movement 
{
	default void move()
	{
		System.out.println("This is movement");
	}
}
