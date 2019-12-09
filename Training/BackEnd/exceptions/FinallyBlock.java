package com.tyss.exceptions;

public class FinallyBlock 
{
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		try
		{
			System.out.println(10/0);
		} catch (ArithmeticException ae)
		{
			System.out.println("This is a zero error");
			System.out.println(ae.getMessage());
		} finally
		{
			System.out.println("Finally Executed");
		}
		
		System.out.println("Main Method Ended");
	}
}
