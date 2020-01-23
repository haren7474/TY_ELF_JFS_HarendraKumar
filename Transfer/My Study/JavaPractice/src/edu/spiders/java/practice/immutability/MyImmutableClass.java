package edu.spiders.java.practice.immutability;

final public class MyImmutableClass 
{
	final int x;
	MyImmutableClass(int x)
	{
		this.x=x;
	}
	
	public MyImmutableClass modify(int x)
	{
		if(this.x!=x)
		{
			return new MyImmutableClass(x);
		}
		else 
			return this;
	}
}
