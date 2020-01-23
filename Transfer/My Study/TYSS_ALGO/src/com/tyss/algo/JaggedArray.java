package com.tyss.algo;

import java.util.Scanner;

public class JaggedArray {
	static Scanner sc = new Scanner(System.in);

	public static int[][] jaggedArray() {
		int[][] myJaggedArray = new int[5][];
		myJaggedArray[0] = new int[6];
		myJaggedArray[1] = new int[2];
		myJaggedArray[2] = new int[8];
		myJaggedArray[3] = new int[2];
		myJaggedArray[4] = new int[3];

		int count = 0;
		System.out.println("Please enter array elements");
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				myJaggedArray[i][j] = count++;
			}
		}

		System.out.println("Your Array");
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				System.out.print(myJaggedArray[i][j] + " ");
			}
			System.out.println();
		}

		int sum = 0;
		int myCount = 0;
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				sum = sum + myJaggedArray[i][j];
				myCount++;
			}
		}
		System.out.println("Sum of these numbers: " + sum);
		System.out.println("Avg of these numbers: " + (sum / myCount));

		int largest = myJaggedArray[0][0];
		int prow = 0;
		int pcol = 0;
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				if (myJaggedArray[i][j] > largest) {
					largest = myJaggedArray[i][j];
					prow = i;
					pcol = j;
				}

			}
		}

		System.out.println("Largest Number is: " + largest + " and position row and col : " + prow + " " + pcol);

		// Smallest
		prow = 0;
		pcol = 0;
		int smallest = myJaggedArray[0][0];
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				if (myJaggedArray[i][j] < largest) {
					largest = myJaggedArray[i][j];
					prow = i;
					pcol = j;
				}

			}
		}

		System.out.println("smallest Number is: " + smallest + " and position row and col : " + prow + " " + pcol);

		// Sum of last elements
		int lastSum = 0;
		for (int i = 0; i < myJaggedArray.length; i++) {
			for (int j = 0; j < myJaggedArray[i].length; j++) {
				if (j == myJaggedArray[i].length - 1) {
					lastSum = lastSum + myJaggedArray[i][j];
				}
			}
		}
		System.out.println("Sum of all elements :" + lastSum);
		return myJaggedArray;
	}
}
