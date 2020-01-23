package com.tyss.overriding;

public class TestAnimal 
{
	public static void main(String[] args) 
	{
		Cat c1= new Cat();
		c1.eat();
		Lion l1= new Lion();
		l1.eat();
		
		Animal a1= new Cat();
		a1.eat();
		
		Animal a2= new Lion();
		a2.eat();
	}
}
