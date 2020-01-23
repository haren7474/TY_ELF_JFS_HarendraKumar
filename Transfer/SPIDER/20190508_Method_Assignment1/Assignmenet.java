//Write a program to find biggest of 3 numbres
//Write a program to check given char is vowel or not
//Write a program to print the numbers from 1 to 100.
//Write a program to print only odd numbers between 1 to 100.
//Write a program to add two numbers and check if result is greater than 100 or not.


class import java.util.Scanner;
class GreaterNumberInArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter size of array");
		int size= sc.nextInt();

		int[] arr= new int[size];

		System.out.println("Please enter elements of the array");
		for(int i=0; i<size;i++)
		{
		int arr[i]= sc.nextInt();
		}
		
		checkGreaterInArray(arr[]);

		System.out.println("Main method ended");
	}


	//To Check greater between 2
	public static void checkGreaterInArray()
	{
		
		//printResult(b,n1,n2);
	}

	//To print the result
	public static void printResult(boolean b, int n1, int n2)
	{	if(b==true)
		{
		System.out.println("Biggest Number is: "+n1);
		}
		else
		{
		System.out.println("Biggest Number is: "+n2);
		}
	}

}
 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
