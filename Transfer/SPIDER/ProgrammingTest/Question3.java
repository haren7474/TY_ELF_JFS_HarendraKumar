package edu.jspiders.programmingtest.test;

/*
 * Write the logic for the program where we get back an array which consists of
 * the count of elements which are smaller than the given elements in the array
 * 
 * i/p --> 5 6 4 2 1 8
 * 
 * o/p --> element	count
 * 			5		3
 * 			6		4
 * 			4		2
 * 			1		0
 * 			8		5
 * 
 * marks --> 4
 */

public class Question3 
{
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) 
		{
			arr[i] = Integer.parseInt(args[i+1]);
		}
		
		int[] countArr = count(arr,length);
	
		System.out.println("The Count for Each element is ");
		System.out.println("Element \t Count");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+"\t"+countArr[i]);
		}
	}

	static int[] count(int[] arr, int length) 
	{
		// Didn't Expect questions like this ??/
		
		return null;
	}

}