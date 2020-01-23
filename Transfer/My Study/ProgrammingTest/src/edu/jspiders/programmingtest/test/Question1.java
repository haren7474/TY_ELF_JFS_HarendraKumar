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
		
		int n1=0, n2=1, sum=0, largest=0;
		while(n2<=upper)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			if(sum>= lower && sum<=upper && sum%2==1)
			{
				largest=sum;
			}
		}
	
		return largest;
	}
}
