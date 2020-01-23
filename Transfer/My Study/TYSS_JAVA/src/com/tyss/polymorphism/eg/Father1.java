package com.tyss.polymorphism.eg;

public interface Father1 
{
	default void home()
	{
		System.out.println("This is Father1 home");
	}
}
