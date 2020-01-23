package com.tyss.polymorphism;

public class TestAnimal {

	public static void main(String[] args) 
	{
		Animal a1= new Animal();
		a1.eat();
		
		System.out.println("---------");
		
		Animal a2= new Cat();
		a2.eat();
	}

}
