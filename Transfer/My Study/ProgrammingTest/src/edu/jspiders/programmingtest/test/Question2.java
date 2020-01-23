package edu.jspiders.programmingtest.test;

/*
 * Print the Given sequence using recursive call
 * 1A2b3C4d.....
 * Declare your own variables required for the execution of the code
 * 
 * marks --> 3
 */

public class Question2 
{
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		printSequence(length);
	}
	static int n=1;
	static void printSequence(int length) 
	{
		char ch1='A', ch2='a';
		int i=1;
		
		if(i<length-1)
		{
			printSequence(i+1);
			
			if(i%4==0)
			{
				System.out.print(ch2++);
				ch1++;
			}
			else if(i%2==0)
			{
				System.out.print(ch1++);
				ch2++;
			}
			else
			{
				System.out.print(n++);
			}
		}
	}
}