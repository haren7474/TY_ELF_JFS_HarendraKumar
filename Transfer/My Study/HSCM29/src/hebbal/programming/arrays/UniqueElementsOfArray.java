package hebbal.programming.arrays;

import java.util.Scanner;

public class UniqueElementsOfArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = { 5,0,4,9,3,0,2 };
		// inputArray();
		while (true) {
			System.out.println("\n1. Print the Array\n2. Reverse Array\n3. Print Unique Elements\n"
					+ "4. Check pair Sum to given number\n5. Smaller numbers wrt given array elements\n"
					+ "6. Leader Elements\n7. Print Duplicates\n8. Print once in multiple duplicates\n"
					+ "9. Leader Numbers\n10. Find Largest and Smallest\n11. Find Second Largest\n15. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("\nYour Array: ");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i] + " ");
				}
				break;

			case 2:
				int[] b = new int[a.length];

				for (int i = a.length - 1; i > -1; i--) {
					b[a.length - 1 - i] = a[i];
				}

				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i] + " ");
				}
				break;

			case 3:
				//uniqueElementsInArray(a);
				rightShiftZeros(a);
				break;

			case 4:
				checkPairSum(a);
				break;

			case 5:
				int[] c = inputArray();
				lessThanGivenNumber(a, c);
				break;

			case 7:
				duplicateElementsInArray(a);
				break;

			case 8:
				printOnceForMultDups(a);
				break;

			case 9:
				leaderNumber(a);
				break;

			case 10:
				printLargestSmallest(a);
				break;
				
			case 11:
				secondLargest(a);

			case 15:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

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

	public static void uniqueElementsInArray(int[] a) {
		System.out.print("\nUnique Elements in your array are: ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static void rightShiftZeros(int[] a) 
	{
		System.out.print("\nAfter Shifting: ");
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==0)
			{
				for(int j=i; j<a.length;j++)
				{
					a[i]=a[i+1];
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

	public static void checkPairSum(int[] a) {
		System.out.println("\nPlease enter an element to check pair sum");
		int elem = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && (a[i] + a[j] == elem)) {
					System.out.println("Pair is: " + a[i] + " " + a[j]);
				}

			}
		}
	}

	public static void lessThanGivenNumber(int[] a, int[] b) {
		System.out.print("Your Second Array: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			if (checkUniqueElementsInArray(a, a[i])) {
				int count = 0;
				for (int j = 0; j < b.length; j++) {
					if (a[i] > b[j]) {
						count++;
					}
				}
				System.out.println("\nNumber: " + a[i] + " Count: " + count);
			}
		}

	}

	public static void duplicateElementsInArray(int[] a) {
		System.out.print("\nDuplicate Elements in your array are: ");

		for (int i = 0; i < a.length - 1; i++) {
			{
				int count = 0;
				for (int j = i + 1; j < a.length; j++) {
					if (i != j && a[i] == a[j]) {
						count++;
						break;
					}
				}
				if (count > 0) {
					System.out.print(a[i] + " ");
				}

			}
		}
	}

	public static void printOnceForMultDups(int[] a) {
		System.out.print("\nDuplicate Elements in your array are: ");

		for (int i = 0; i < a.length; i++) {
			{
				int count = 0;
				for (int j = 0; j < a.length; j++) {
					if (i != j && a[i] == a[j] && i > j) {
						break;
					} else if (i != j && a[i] == a[j]) {
						count++;
						break;
					}
				}
				if (count > 0) {
					System.out.print(a[i] + " ");
				}

			}
		}
	}

	public static void leaderNumber(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					count++;
				}
			}
			System.out.println("For " + a[i] + ", the count of smaller numbers is " + count);
		}
	}

	public static boolean checkUniqueElementsInArray(int[] a, int n) {
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					count++;
					break;
				}
			}

			if (count == 0) {
				b = true;
			}
		}
		return b;
	}

	public static void printLargestSmallest(int[] a) {
		int largest = 0;
		int smallest =a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest)

			{
				largest = a[i];
			}
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < smallest)

			{
				smallest = a[i];
			}
		}
		
		System.out.println("largest is "+ largest + "and smallest is "+ smallest);
	}
	
	public static void secondLargest(int[] a) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > largest)

			{
				largest = a[i];
			}
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > secondLargest && a[i] < largest)
			{
				secondLargest = a[i];
			}
		}
		
		System.out.println("largest is "+ largest + " and second Largest is "+ secondLargest);
	}

}
