package com.tyss.finalvariable;

public class TestCalculator 
{
	public static void main(String[] args) {
		Calculator c= new Calculator();
		System.out.println(c.cal(10, 20));

		System.out.println("-----------------");
		
		ScienteficCal cal= new ScienteficCal();
		System.out.println(cal.cal(20, 30));
	}
}
