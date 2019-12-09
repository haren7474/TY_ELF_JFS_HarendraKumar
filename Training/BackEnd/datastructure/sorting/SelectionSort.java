package com.tyss.datastructure.sorting;

public class SelectionSort 
{
	public static void sSort(int [] a)
	{
		for (int i = 0; i < a.length - 1; i++) 
		{
			int k=i;
			int j=i+1;
			
			while(j<a.length)
			{
				if(a[k]> a[j])
				k=j;
				j++;
			}
			
			int temp= a[k];
			a[k]= a[i];
			a[i]= temp;
		}

		System.out.print("\nYour Sorted Array using Selection Sort:\n");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
}
