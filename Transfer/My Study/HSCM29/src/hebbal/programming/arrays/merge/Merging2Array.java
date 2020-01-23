package hebbal.programming.arrays.merge;

import java.util.Scanner;

public class Merging2Array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = inputArray();
		int b[] = inputArray();
		int c[] = inputArray();
		System.out.print("\nYour Originol Array1: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("\nYour Originol Array2: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		// mergeArray(a, b);
		// mergeAlternateArray(a, b);
		commonElementsin2Array(a, b);
		commonElementsin3Array(a, b, c);
	}

	public static int[] inputArray() {
		System.out.println("\nPlease enter size of the array ");
		int[] b = new int[sc.nextInt()];

		System.out.println("Enter " + b.length + " elements ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		return b;
	}

	public static void mergeArray(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length) {
			res[k++] = a[i++];
		}

		while (j < b.length) {
			res[k++] = b[j++];
		}

		System.out.println("\nResultant Array, direct merge");

		for (k = 0; k < res.length; k++) {
			System.out.print(res[k] + " ");
		}
	}

	public static void mergeAlternateArray(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		for (; k < res.length;) 
		{
			if (i < a.length) {
				res[k++] = a[i++];
			}

			if (j < b.length) {
				res[k++] = b[j++];
			}
		}

		System.out.println("\nResultant Array Alternate element merge");

		for (k = 0; k < res.length; k++) {
			System.out.print(res[k] + " ");
		}
	}

	public static void commonElementsin2Array(int[] a, int[] b) {
		System.out.println("\nResultant Array Common element merge");

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++)
			{
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}

	}

	public static void commonElementsin3Array(int[] a, int[] b, int[] c) {
		System.out.println("\nResultant Array Common element in 3 array");

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j]) 
				{
					for (int k = 0; k < c.length; k++) 
					{
						if (a[i] == c[k]) 
						{
							System.out.print(a[i]+ " ");
							break;
						}
					}
				}
			}
		}

	}
}
