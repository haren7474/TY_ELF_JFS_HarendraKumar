package edu.jspiders.programmingtest.test;

/*
 * Write the logic to check whether a given number is jumbled number or not.
 * 
 * i/p 87676545
 * 
 * o/p jumbled number
 * 
 * i/p 76532
 * 
 * o/p not jumbled number
 * 
 * jumbled number is a number in which the difference between the adjacent digit is 1.
 * 
 * 
 * marks --> 3
 */

public class Question7 
{
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(args[0]);
		
		if(checkJumbled(number))
		{
			System.out.println(number +" is a jumbled number");
		}
		else
		{
			System.out.println(number +" is not a jumbled number");
		}
	}

	public static boolean checkJumbled(int number)
	{
		//Write the Logic here... That is if you can :P :P
		
		return false;
	}

}