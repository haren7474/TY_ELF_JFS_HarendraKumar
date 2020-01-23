package com.tyss.objectclass;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1= new Employee(1, "Sweta");
		Employee e2= new Employee(1, "Sweta");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
