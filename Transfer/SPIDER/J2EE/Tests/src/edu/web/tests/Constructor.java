package edu.web.tests;

public class Constructor 
{
	public static void main(String[] args) 
	{
		Parent c= new Child(10,20);
		c.m1();
	}
}

class Parent
{
	Parent()
	{
		System.out.println("This is Parent Class constructor");
	}
	
	public void m1()
	{
		System.out.println("This is m1() in Parent");
	}
}


class Child extends Parent
{
	Child()
	{ 
		super();
		System.out.println("This is Child Class constructor");
	}
	
	Child(int x, int y)
	{
		this();
		System.out.println(x+y);
	}
	
	public void m1()
	{
		System.out.println("This is m1() overridden in child");
	}
}