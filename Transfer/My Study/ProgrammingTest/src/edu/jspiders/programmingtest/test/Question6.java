package edu.jspiders.programmingtest.test;

/*
 * Write the logic for the program which returns the biggest peek element in the array.
 * 
 * peek element--> its an element which is greater than its neighbours.
 * 
 * i/p --> 5 6 4 3 2 8 4
 * 
 * in the above example we have 6 which is greater than 5 and 4 so its a peek element.
 * 
 * in the about input we have 6, 3 and 8 as peek element but the biggest is 8
 * 
 * 
 * marks --> 5
 */

public class Question6 
{
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) 
		{
			arr[i] = Integer.parseInt(args[i+1]);
		}
		
		int peek = findPeek(arr);
		
		System.out.println("Biggest Peek Element --> "+peek);
	}

	 static int findPeek(int[] arr) 
	 {
		 int largest = 0;
		for(int i=1; i<arr.length-1;i++)
		{
			if(arr[i]> arr[i+1] && arr[i]> arr[i-1] )
			{
				if(arr[i]> largest)
				{
					largest= arr[i];
				}
			}
		}
		return largest;
	 }

}