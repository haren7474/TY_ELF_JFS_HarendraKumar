package com.tyss.exceptions;

public class TestMultiple {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		MultipleCatch m= new MultipleCatch();
		m.exceptionCheck(0, "Hello");
		m.exceptionCheck(1, null);
		System.out.println("MME");
	}
}
