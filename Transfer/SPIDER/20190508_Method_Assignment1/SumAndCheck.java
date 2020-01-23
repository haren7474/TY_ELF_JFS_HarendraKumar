import java.util.Scanner;
class SumAndCheck
	{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter 1st number");
		int n1= sc.nextInt();

		System.out.println("Please enter 2nd number");
		int n2= sc.nextInt();

		int sum= add(n1,n2);
		printResult(sum, n1, n2);

		System.out.println("Main method ended");
	}


	//To Calculate sum
	public static int add(int n1, int n2)
	{
		return n1+n2;
	}

	//To print the result
	public static void printResult(int sum, int n1, int n2)
	{	if(sum>100)
		{
		System.out.println("Sum of "+n1 + " and " + n2+ " is: "+sum+" which is greater than 100");
		}
		else if(sum<100)
		{
		System.out.println("Sum of "+n1 + " and " + n2+ " is: "+sum+" which is less than 100");
		}
		else
		{
		System.out.println("Sum of "+n1 + " and " + n2+ " is: "+sum+" which is equal 100");
		}
	}

}
