package com.tyss.LocalVariables;

public class Car extends Vehicle
{
	int cost=30000;
	
	void getPrice()
	{
		int cost=10000;
		
		System.out.println("Local Cost "+ cost);
		System.out.println("Global Cost "+ this.cost);
		System.out.println("Super Cost "+ super.cost);
	}
}
