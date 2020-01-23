package hebbal.programming.arrays.twodimension;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int row1 = sc.nextInt();

		System.out.println("Please enter number of Column");
		int col1 = sc.nextInt();

		int[][] a = new int[row1][col1];
		
		int val=1;
		int minRow=0, minCol=0, maxRow=row1-1, maxCol= col1-1; 

		while(val<= row1*col1)
		{
			for(int j=minCol; j<= maxCol;j++)
			{
				a[minRow][j]= val++;
			}
			
			for(int i=minRow; i<= maxRow;i++)
			{
				a[i][maxCol]= val++;
			}
			
			for(int j=maxCol-1; j>= minCol;j--)
			{
				a[maxRow][j]= val++;
			}
			
			for(int i=maxRow-1; i>= minRow+1;i--)
			{
				a[i][minCol]= val++;
			}
			
			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
			
		}
		
		
		System.out.println("\nPrint Matrix Array");
		for (int i = 0; i < row1; i++)
		{
			for (int j = 0; j < col1; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
