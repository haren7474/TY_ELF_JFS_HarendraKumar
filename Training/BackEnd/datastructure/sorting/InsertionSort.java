package com.tyss.datastructure.sorting;

public class InsertionSort 
{
	public static void iSort(int [] a)
	{
		for (int i = 0; i < a.length - 1; i++) 
		{
			int val= a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>val)
			{
				if(a[j+1]> a[j])
				j--;
			}
			a[j+1]= val;
		}

		System.out.print("\nYour Sorted Array insertionSort:\n");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	
}
