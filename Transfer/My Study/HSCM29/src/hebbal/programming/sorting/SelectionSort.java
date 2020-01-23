package hebbal.programming.sorting;

import java.util.Scanner;

public class SelectionSort 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int a[] = inputArray();

		System.out.print("\nYour Originol Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		selectionSort(a);
		insertionSort(a);
	}

	public static int[] inputArray() {
		System.out.println("Please enter size of the array ");
		int[] b = new int[sc.nextInt()];

		System.out.println("Enter " + b.length + " elements ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		return b;
	}

	public static void selectionSort(int[] a) 
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

		System.out.print("\nYour Sorted Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	

	public static void insertionSort(int[] a) 
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

		System.out.print("\nYour Sorted Array insertionSort: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
}
