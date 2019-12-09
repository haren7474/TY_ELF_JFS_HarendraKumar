package com.tyss.exceptions.custom.checked;

public class Person {

	public static void main(String[] args) 
	{                            
		Election e1= new Election();
		try 
		{
			e1.vote(17);
		} 
		catch (AgeLimitException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
