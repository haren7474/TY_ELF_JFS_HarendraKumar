package com.tyss.abstractClass;

public class TestDog 
{
	public static void main(String[] args) 
	{
		Dog d= new Dog("Bala");
		System.out.println(d.name);
		
		Animal a= new Dog("Kala");
		System.out.println(a.name);
	}
}
