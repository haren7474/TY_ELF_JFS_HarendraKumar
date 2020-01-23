package com.tyss.Constructor;

public class Car 
{	
	String brand;
	int showroomPrice;
	double onroadPrice;
	boolean isAvailable;
	char flag;
	
	
	public String getDetails() 
	{
		return "Car [brand=" + brand + ", showroomPrice=" + showroomPrice + ", onroadPrice=" + onroadPrice
				+ ", isAvailable=" + isAvailable + ", flag=" + flag + "]";
	}
}
