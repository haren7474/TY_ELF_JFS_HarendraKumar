package com.tyss.exceptions.checked;

public class ExceptionA 
{
	public static void main(String[] args) 
	{
		System.out.println("MMS");
		
		try {
			Class c1= Class.forName("com.tyss.exceptions.checked.Person");
			System.out.println(c1);
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class not found");
			
		}
		
		System.out.println("MME");
	}

}
