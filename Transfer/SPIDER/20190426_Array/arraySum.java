import java.util.Scanner;

class arraySum
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Please enter number of rows");
int row=sc.nextInt();

System.out.println("Please enter number of columns");
int col=sc.nextInt();

int[][] arr1 = new int[row][col];
int[][] arr2 = new int[row][col];
int[][] arr3 = new int[row][col];

//Taking Input Array1

System.out.println("Please enter elements of the array1");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	arr1[i][j]= sc.nextInt();
	}

}

//Taking Input Array2

System.out.println("Please enter elements of the array2");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	arr2[i][j]= sc.nextInt();
	}

}

//Printing Array1
System.out.println("Elements of the array are");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	System.out.print(arr1[i][j]);
	}
	System.out.println();
}


//Printing Array2
System.out.println("Elements of the array are");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	System.out.print(arr2[i][j]);
	}
	System.out.println();
}


//Adding above 2 arrays
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	arr3[i][j]= arr1[i][j] + arr2[i][j];
	}

}



//Printing Sum of both Arrays;

System.out.println("Sum of above 2 Arrays are");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	System.out.print(arr3[i][j]);
	}
	System.out.println();
}

//Printing Sum of both Arrays;

System.out.println("Sum without using 3rd Array");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	System.out.print(arr1[i][j] + arr2[i][j]);
	}
	System.out.println();
}

}
}


