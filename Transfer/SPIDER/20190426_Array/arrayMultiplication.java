import java.util.Scanner;
class arrayMultiplication
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Printing Multiplication of both Arrays
		arrayMult();

	}

	
	
	
public static void arrayMult()
{
Scanner sc1=new Scanner(System.in);

System.out.println("Please enter number of rows or matrix1");
int row1=sc1.nextInt();

System.out.println("Please enter number of columns of matrix1");
int col1=sc1.nextInt();

System.out.println("Please enter number of rows or matrix2");
int row2=sc1.nextInt();

System.out.println("Please enter number of columns of matrix2");
int col2=sc1.nextInt();

int[][] mat1 = new int[row1][col1];
int[][] mat2 = new int[row2][col2];
int[][] product = new int[row1][col2];

//Taking Input Array1

System.out.println("Please enter elements of the array1");
for(int i=0; i<row1; i++)
{
	for(int j=0; j<col1; j++)
	{
	mat1[i][j]= sc1.nextInt();
	}

}

//Taking Input Array2

System.out.println("Please enter elements of the array2");
for(int i=0; i<row2; i++)
{
	for(int j=0; j<col2; j++)
	{
	mat2[i][j]= sc1.nextInt();
	}

}

//Printing Array1
System.out.println("Elements of the array are");
for(int i=0; i<row1; i++)
{
	for(int j=0; j<col1; j++)
	{
	System.out.print(mat1[i][j]+" ");
	}
	System.out.println();
}


//Printing Array2
System.out.println("Elements of the array are");
for(int i=0; i<row2; i++)
{
	for(int j=0; j<col2; j++)
	{
	System.out.print(mat2[i][j]+" ");
	}
	System.out.println();
}

//Multiplying

for(int i=0; i<row1; i++)
{
	for(int j=0; j<col2; j++)
	{
		for(int k=0; k< col1;k++)
		{
			product [i][j]= product[i][j]+ mat1[i][k]*mat2[k][j];
		}
			
	}

}


System.out.println("Printing Multiplication of both Arrays");

for(int i=0; i<row1; i++)
{
	for(int j=0; j<col2; j++)
	{
		System.out.print(product[i][j]+" ");
	}
		System.out.println();
}


}
}
