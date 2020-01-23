package com.tyss.boxing;

public class Test {
	public static void main(String[] args) 
	{

		int i1 = 10;

		System.out.println("--------INTEGER-------");
		// Boxing
		Integer i2 = new Integer(i1);

		// Unboxing
		int i3 = i2.intValue();
		int i4= i2;

		System.out.println("i1 " + i1);
		System.out.println("i2 " + i2);
		System.out.println("i3 " + i3);
		System.out.println("i4 " + i4);

		System.out.println("--------DOUBLE-------");
		double d1 = 10.2;

		// Boxing
		Double d2 = new Double(d1);

		// Unboxing
		double d3 = d2.doubleValue();                                                             

		System.out.println("d1 " + d1);
		System.out.println("d2 " + d2);
		System.out.println("d3 " + d3);

	}
}
