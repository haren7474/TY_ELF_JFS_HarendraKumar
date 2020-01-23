package edu.jspiders.programmingtest.test;

import java.util.Scanner;

/*
 * Write the logic to return an array of common elements between two arrays.
 * 
 * i/p  5 4 3 2 6        8 7 5 3 2
 * 
 * o/p 5 3 2
 * 
 * 
 * marks --> 4
 */

public class Question8 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter the size of a ");
		int[] a = new int[sc.nextInt()];
		
		System.out.println("Enter the elements for a");
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter the size of b ");
		int[] b = new int[sc.nextInt()];
		
		for (int i = 0; i < b.length; i++) 
		{
			b[i] = sc.nextInt();
		}
		
		int[] commonArr = commonElements(a,b);
	
		System.out.println("Common elements are");
	
		for (int i = 0; i < commonArr.length; i++) 
		{
			System.out.println(commonArr[i]);
		}
		
	}

	public static int[] commonElements(int[] a, int[] b) 
	{
		// Try your best Kiddo, i hope you get it right....
		
		return null;
	}

}