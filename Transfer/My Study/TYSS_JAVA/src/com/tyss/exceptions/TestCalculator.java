package com.tyss.exceptions;

public class TestCalculator {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		Calculator c= new Calculator();
		System.out.println("Divide Method called");
		c.divide(10, 0);
		System.out.println("Divided");
		System.out.println("MME");				
	}
}
