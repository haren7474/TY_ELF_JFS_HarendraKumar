package edu.spiders.java.practice.immutability;

final public class ImmutableInteger 
{
	final int num;
	
	public ImmutableInteger(int num)
	{
		this.num=num;
	}
	
	public ImmutableInteger modifyObject(int num)
	{
		if(this.num!=num)
		{
			return new ImmutableInteger(num);
		}
		else
		{
			return this;
		}
	}
}
