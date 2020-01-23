package com.tyss.objectclass;

public class Vehicle implements Cloneable
{
	String vName;
	
	public Vehicle(String vName) 
	{
		this.vName = vName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
