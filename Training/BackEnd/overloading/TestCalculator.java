package com.tyss.overloading;

public class TestCalculator {

	public static void main(String[] args) 
	{
		Calculator c1= new Calculator();
		
		System.out.println("Retust 1: "+ c1.add(5));
		System.out.println("Retust 2: "+ c1.add(5, 7));
		System.out.println("Retust 3: "+ c1.add(5.1,5.3));
		
		Calculator.multiply(25.2);
		Calculator.multiply(250);
		Calculator.multiply(12, 13);
	}

}
 