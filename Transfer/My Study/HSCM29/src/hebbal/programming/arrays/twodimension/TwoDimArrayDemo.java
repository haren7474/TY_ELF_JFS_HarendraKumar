package hebbal.programming.arrays.twodimension;

import java.util.Scanner;

public class TwoDimArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int row = sc.nextInt();

		System.out.println("Please enter number of Column");
		int col = sc.nextInt();

		int[][] a = new int[row][col];

		System.out.println("\nPlease enter Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nPrint Matrix Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Transpose Matrix Logic
		int[][] transposeArray = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				transposeArray[i][j] = a[j][i];
			}
			System.out.println();
		}

		System.out.println("\nPrint Transpose Array");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(transposeArray[i][j] + " ");
			}
			System.out.println();
		}

		// --------------------------------Addition of 2 Matrix----------------------

		int[][] b = new int[row][col];

		System.out.println("\nPlease enter Elements for Matrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nPrint Matrix2 Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// Sum of 2 Matrix Logic
		int[][] sumArray = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sumArray[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}

		System.out.println("\nPrint Sum of 2 Array");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(sumArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}
