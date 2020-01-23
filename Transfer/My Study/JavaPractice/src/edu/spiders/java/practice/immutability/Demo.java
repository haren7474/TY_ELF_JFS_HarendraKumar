package edu.spiders.java.practice.immutability;

final public class Demo 
{
	final String name;
	
	Demo(String name)
	{
		this.name=name;
	}
	
	public Demo modify(String name)
	{
		if(this.name!=name)
		{
			return new Demo(name);
		}
		
		else
			return this;
	}
	
}
