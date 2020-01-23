package edu.spiders.java.practice.immutability;

public class MainDemo 
{
	public static void main(String[] args) 
	{
	Demo d= new Demo("Harendra");
	Demo d1=d.modify("Sunny");
	Demo d2= d.modify("Harendra");
	
	System.out.println(d==d1);
	System.out.println(d==d2);
	
	}
}
