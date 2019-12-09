package com.tyss.objectclass;

public class TestAnimal {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Dog d1= new Dog("Nancy");
		
		Class c1= d1.getClass();
		System.out.println(c1);
		System.out.println(d1.name);
		
		
		System.out.println("------------------");		
		Dog d2= (Dog) c1.newInstance(); //newInstance() checks for a zero argument constructor
		System.out.println(c1);
		System.out.println(d2.name);
		
		
		System.out.println("------------------");			
		Class c2= Class.forName("com.tyss.objectclass.Dog");
		System.out.println(c2);
		Dog d3= (Dog) c2.newInstance(); 
		System.out.println(d3.name);		
	}
}
