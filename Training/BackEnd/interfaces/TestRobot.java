package com.tyss.interfaces;

public class TestRobot {

	public static void main(String[] args) 
	{
		Robot r1= new Robot();
		r1.move();
		r1.talk();
		
		System.out.println("\nInterface type refrence variable");
		Movement m= new Robot();
		m.move();
	}

}
