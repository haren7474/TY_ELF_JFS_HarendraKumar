package edu.jspiders.programmingtest.test;

/*
 * Write a program to find the biggest odd ArmStrong Number between the given range
 * 
 * marks --> 2
 */

public class Question5 
{
	public static void main(String[] args) 
	{
		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		
		biggestArmStrong(lower,upper);
	}

	public static void biggestArmStrong(int lower, int upper) 
	{
		int count=0;
		for(int i=upper; i>= lower; i--)
		{
			if(checkArmstrong(i))
			{
				System.out.println(i + " is the largest Armstrong number in given range");
				count++;
				break;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("There is no Armstrong number present in given range");
		}
	}
	
	public static boolean checkArmstrong(int n)
	{
		int num = n;
		int digit = 0;
		int sum = 0;
		int rem = 0;
		boolean b= false;

		while (num != 0) {
			num = num / 10;
			digit++;
		}

		num = n;

		while (num != 0) {
			rem = num % 10;

			sum = sum + powerOfDigit(digit, rem);
			num = num / 10;
		}

		if (sum == n) b=true;
		return b;
	}
	
	public static int powerOfDigit(int digit, int rem) {
		int product = 1;
		for (int i = 0; i < digit; i++) {
			product = product * rem;
		}
		return product;
	}
}
