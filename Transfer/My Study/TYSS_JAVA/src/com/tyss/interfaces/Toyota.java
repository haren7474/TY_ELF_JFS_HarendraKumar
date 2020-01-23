package com.tyss.interfaces;

public interface Toyota 
{
	double cost=500.12;
	void design();
	void engine();
	
	default void methodCheck()
	{
		System.out.println("This is a concrete method inside interface");
	}	
	
	static void methodCheck2()
	{
		System.out.println("This is a concrete static method inside interface");
	}
}
