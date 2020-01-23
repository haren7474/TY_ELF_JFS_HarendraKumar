import java.util.Scanner;

class array2d
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Please enter number of rows");
int row=sc.nextInt();

System.out.println("Please enter number of columns");
int col=sc.nextInt();

int[][] arr = new int[row][col];

System.out.println("Please enter elements of the array");

//Taking Input
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	arr[i][j]= sc.nextInt();
	}

}

//Printing
System.out.println("Elements of the array are");
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
	System.out.print(arr[i][j]);
	}
	System.out.println();
}


}
}


