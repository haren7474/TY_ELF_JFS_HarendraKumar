package com.tyss.stringclass;

public class CustomMain {

	public static void main(String[] args) 
	{
		CustomImmutableClass ci= new CustomImmutableClass("Haren", 26);
		System.out.println(ci.hashCode());
		
		ci= new CustomImmutableClass("Sweta", 25);
		System.out.println(ci.hashCode());
		System.out.println(ci.getAge());
		System.out.println(ci.getName());
	}
}
