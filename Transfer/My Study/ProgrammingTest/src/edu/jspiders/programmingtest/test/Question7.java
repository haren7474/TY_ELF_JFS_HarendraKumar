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
		int temp= number;
		int count=0;
		
		while(number>0)
		{
			count++;			
			number= number/10;
		}
		
		number=temp;
		
		int [] a= new int [count];
		
		for(int i=0; i<a.length;i++)
		{
			int rem= number%10;
			a[i]=rem;
			number= number/10;
		}
		
		
		boolean b=false;
		for(int i=1; i<a.length-1;i++)
		{
			
			if(!((a[i]- a[i+1] ==1 || a[i]- a[i+1] == -1) &&  (a[i-1] - a[i]==1 || a[i-1] - a[i]==-1)))
			{
				break;
			}
			else
				b=true;
		}
		
		return b;
	}

}