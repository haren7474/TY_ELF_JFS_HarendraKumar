package com.tyss.arrays;

import java.util.Scanner;

public class Array3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter array size");
		int size= sc.nextInt();
		
		char a[]= new char[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Please enter element for index: "+ i);
			a[i]= sc.next().charAt(0);
		}
		
		System.out.println("Your array is: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\nsum of a and b" + (a[0]));
	}
}
