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
					break;
		}
		
	}

	static void insertionsort(int[] arr) 
	{
		System.out.println("Insertion Sort");
		
		for (int i = 0; i < arr.length - 1; i++) 
		{
			int val= arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>val)
			{
				if(arr[j+1]> arr[j])
				j--;
			}
			arr[j+1]= val;
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionsort(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			int k=i;
			int j=i+1;			
			while(j<arr.length)
			{
				if(arr[k]> arr[j])
				k=j;
				j++;
			}
	
			int temp= arr[k];
			arr[k]= arr[i];
			arr[i]= temp;
		}
		
		System.out.println("Selection Sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = 0; j < arr.length - 1 - i; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Bubble Sort");
		for (int i = 0; i < arr.length - 1; i++) 
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
