package com.tyss.overloading;

public class Calculator 
{
	int add(int a)
	{
		return a+a;
	}
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	
	static void multiply(int a)
	{
		System.out.println("Sum is :"+ (a+a));
	}
	
	
	static void multiply(int a, int b)
	{
		System.out.println("Sum is :"+ (a+b));
	}
	
	static void multiply(double d)
	{
		System.out.println("Sum is :"+ (d+d));
	}
}
