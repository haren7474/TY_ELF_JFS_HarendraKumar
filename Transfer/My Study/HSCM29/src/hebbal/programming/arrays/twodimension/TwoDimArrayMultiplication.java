package hebbal.programming.arrays.twodimension;

import java.util.Scanner;

public class TwoDimArrayMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int row1 = sc.nextInt();

		System.out.println("Please enter number of Column");
		int col1 = sc.nextInt();

		int[][] a = new int[row1][col1];

		System.out.println("\nPlease enter Elements");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nPrint Matrix Array");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Please enter number of rows");
		int row2 = sc.nextInt();

		System.out.println("Please enter number of Column");
		int col2 = sc.nextInt();
		
		int[][] b = new int[row2][col2];

		System.out.println("\nPlease enter Elements for Matrix 2");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nPrint Matrix2 Array");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// Product of 2 Matrix Logic
		int[][] multArray = new int[row1][col2];
		for (int i = 0; i < row1; i++) 
		{
			for (int j = 0; j < col2; j++) 
			{
				for(int k=0; k<row2; k++)
				{
				multArray[i][j] =multArray[i][j]+ a[i][k] * b[k][j];
				}
			}
			System.out.println();
		}

		System.out.println("\nPrint Mult of 2 Array");
		for (int i = 0; i < row1; i++) 
		{
			for (int j = 0; j < col2; j++) 
			{
				System.out.print(multArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
