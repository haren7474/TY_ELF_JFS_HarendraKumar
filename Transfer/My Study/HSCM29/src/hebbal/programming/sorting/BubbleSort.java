package hebbal.programming.sorting;

import java.util.Scanner;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int a[] = inputArray();

		System.out.print("\nYour Originol Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		bubbleSort(a);
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

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.print("\nYour Sorted Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
