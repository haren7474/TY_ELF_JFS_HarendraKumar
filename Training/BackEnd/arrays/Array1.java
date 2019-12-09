package com.tyss.arrays;

import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter array size");
		int size= sc.nextInt();
		
		int a[]= new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Please enter element for index: "+ i);
			a[i]= sc.nextInt();
		}
		
		System.out.println("Your array is: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	}
}
