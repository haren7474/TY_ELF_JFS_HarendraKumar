import java.util.Scanner;
class checkEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter a number");
		int n= sc.nextInt();
		checkEven(n);

		System.out.println("Main method ended");
	}

	public static void checkEven(int n)
	{
		boolean b=true;
		if(n%2==0)
		{
			b=true;
		}
		else
		{
			b=false;
		}

		printResult(b);
	}

	public static void printResult(boolean b)
	{	if(b==true)
		{
		System.out.println("Entered number is Even");
		}
		else
		{
		System.out.println("Entered number is odd");
		}
	}
}
