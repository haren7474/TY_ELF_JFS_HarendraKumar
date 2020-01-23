package edu.jspiders.programmingtest.test;

/*
 * Write a program to Sort the given array using bubble/selection/insertion sort
 * 
 * Take the choice from the user....
 * 
 * 
 * marks --> 5
 */

public class Question9 
{
	public static void main(String[] args) 
	{
		int choice = Integer.parseInt(args[0]);
		
		int[] arr = new int[args.length-1];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(args[i+1]);
		}
		
		switch(choice)
		{
			case 1: bubbleSort(arr);
					break;
			case 2: selectionsort(arr);
					break;
			case 3: insertionsort(arr);
		}
		
	}

	static void insertionsort(int[] arr) 
	{
		// You Thought i will...
	}

	private static void selectionsort(int[] arr) 
	{
		//... not give all the sorting techniques....
	}

	private static void bubbleSort(int[] arr) 
	{
		//.... well you thought wrong..... Buhahahahahaha
	}
}
