package edu.jspiders.programmingtest.test;

/*
 * Write the logic for the program where we get back an array which consists of
 * only unique elements in the array
 * 
 * i/p --> 4 2 5 1 2 4
 * 
 * o/p --> 5 1
 * 
 * marks --> 4
 */

public class Question4 
{
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) 
		{
			arr[i] = Integer.parseInt(args[i+1]);
		}
		
		int[] uniqueArr = count(arr,length);
	
		System.out.println("Unique Elements of the array");
		
		for (int i = 0; i < uniqueArr.length; i++) 
		{
			System.out.println(uniqueArr[i]);
		}
	}

	static int[] count(int[] arr, int length) 
	{
		// If you don't Write it then you are getting killed by me... Buhahahaahaha
		
		return null;
	}

}