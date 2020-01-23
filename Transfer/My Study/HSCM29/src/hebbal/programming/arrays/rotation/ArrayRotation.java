package hebbal.programming.arrays.rotation;

import java.util.Scanner;

public class ArrayRotation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = inputArray();
		System.out.print("\nYour Originol Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		rotateArray(a);
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

	public static void rotateArray(int[] a) {
		int rotFactor = 1;
		for (int i = 1; i <= rotFactor; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				int temp = a[j];
				a[j] = a[j + 1];

				a[j + 1] = temp;
			}
		}

		System.out.print("\nYour Rotated Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
}
