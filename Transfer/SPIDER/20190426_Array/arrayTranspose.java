import java.util.Scanner;

class arrayTranspose
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Please enter number of rows");
int row=sc.nextInt();

System.out.println("Please enter number of columns");
int col=sc.nextInt();

int[][] arr1 = new int[row][col];


//Taking Input Array1

System.out.println("Please enter elements of the array1");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	arr1[i][j]= sc.nextInt();
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


//Printing Transpose;

System.out.println("Transpose of array1");
for(int i=0; i<col; i++)
{
	for(int j=0; j<row; j++)
	{
	System.out.print(arr1[j][i]);
	}
	System.out.println();
}


}
}


