package com.tyss.datastructure.searching;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter array size");
		int size = sc.nextInt();

		int[] a1 = new int[size];

		System.out.println("Please enter Elements");
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}

		System.out.println("------Actual Array----------");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("Please enter number to be searched: ");
		int x= sc.nextInt();
		countingDurationLeniar(a1, x);
		countingDurationBinary(a1, x);
	}
	
	public static void countingDurationLeniar(int[] a1, int x)
	{
		Instant start= Instant.now();
		System.out.println(Leniar.search(a1, x));
		Instant end= Instant.now();
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("Leniar took " + seconds + " seconds");
	}
	
	
	public static void countingDurationBinary(int[] a1, int x)
	{
		Instant start= Instant.now();
		System.out.println(Binary.binarySearch(a1, x));
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("Binary took " + seconds + " seconds");
	}

}
