//Write a program to check if a number is positive or negative
import java.util.Scanner;
class CheckPositiveNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		
		System.out.println("Please enter a number");
		int n= sc.nextInt();

		checkPositive(n);

		System.out.println("Main method ended");
	}


	//To Check Positive or negative number
	public static void checkPositive(int n)
	{
		char c;

		if(n>0)
		{
			c='P';
		}
		else if(n<0)
		{
			c='N';
		}
		else
		{
			c='O';
		}

		printResult(c,n);
	}

	//To print the result
	public static void printResult(char c, int n)
	{	if(c=='P')
		{
		System.out.println(n+" is a positive number");
		}
		else if(c=='N')
		{
		System.out.println(n+" is a negative number");
		}
		else
		{
		System.out.println(n+" is a neither positive nor negative number");
		}
	}

}
