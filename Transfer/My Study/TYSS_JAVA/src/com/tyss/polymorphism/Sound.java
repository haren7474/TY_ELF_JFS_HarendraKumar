package com.tyss.polymorphism;

public interface Sound 
{
	default void move()
	{
		System.out.println("This is Sound");
	}
}
