package com.tyss.access.pack2;

import com.tyss.access.pack1.Employee;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee("Haren"); //default accessMod can be accessed inside package
		System.out.println("Outside Package: "+ e1.name); //default accessMod can be accessed inside package
		e1.getName(); //default accessMod can be accessed inside package
	}
}
