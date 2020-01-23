package edu.jspiders.programmingtest.test;

/* 
 * Fill in the following snipet to find the biggest odd Fibonacci Number in 
 * the given range.
 * The Below Program takes lower and upper values from the Command Line
 * 
 * marks --> 3
 */

class Question1
{
	public static void main(String[] args) 
	{
		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		
		int oddFibo = biggestOddFibo(lower,upper);
	
		System.out.println("Biggest OddFibo = "+oddFibo);
	}

	public static int biggestOddFibo(int lower, int upper)
	{
		// I am going to give you nightmare if you don't solve this program
	
		return 0;
	}
}
