package com.tyss.datastructure.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ArrayMain {

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

		countingDurationBubble(a1);
		countingDurationInsertion(a1);
		countingDurationSelection(a1);
		
		/*
		while (true) {
			System.out.println("\n\n1. Bubble Sort\n2. Merge Sort\n3. Selection Sort\n4. Insertion Sort\n5. Exit");
			System.out.println("Please enter sort choice");
			int sortChoice = sc.nextInt();

			switch (sortChoice) {
			case 1:
				BubbleSort.bSort(a1);
				break;

			case 2:
				MergeSort.mSort(a1);
				break;

			case 3:
				SelectionSort.sSort(a1);
				break;

			case 4:
				InsertionSort.iSort(a1);
				break;

			case 5:
				System.exit(0);
				break;
			}

		}
			*/
	}
	
	public static void countingDurationBubble(int[] a1)
	{
		Instant start= Instant.now();
		System.out.println("Bubble Result: ");
		BubbleSort.bSort(a1);
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("Bubble took " + seconds + " seconds");
	}
	
	public static void countingDurationInsertion(int[] a1)
	{
		Instant start= Instant.now();
		System.out.println("Insertion Result: ");
		InsertionSort.iSort(a1);
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("Insertion took " + seconds + " seconds");
	}
	
	public static void countingDurationSelection(int[] a1)
	{
		Instant start= Instant.now();
		System.out.println("Selection Result: ");
		SelectionSort.sSort(a1);
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("Selection took " + seconds + " seconds");
	}

}
