package com.tyss.objectclass;

public class TestVehicle
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Vehicle v1= new Vehicle("RR");
		System.out.println(v1.vName);
		
		System.out.println("---------------");
		Vehicle v2= (Vehicle) v1.clone();
		System.out.println(v2.vName);
	}
}
