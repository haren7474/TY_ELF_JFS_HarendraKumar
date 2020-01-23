package com.tyss.exceptions.checked.clonexample;


public class TestPersonExp 
{
	public static void main(String[] args) 
	{
		System.out.println("MME");
		Employee e1= new Employee();
		
		try
		{
		Object o= e1.clone();
		System.out.println("Clone Created" + o);	
		try
		{
			Class c= Class.forName("com.tyss.exceptions.checked.clonexample.Employee");
			System.out.println("Class Found" + c);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class Not Found Exception");
		}
		
		} catch (CloneNotSupportedException e)
		{
			System.out.println("Clone Not Supported Exception");
		}
		System.out.println("MME");
	}

}
