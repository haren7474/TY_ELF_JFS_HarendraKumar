import java.util.Scanner;
class GreatestOfThree
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter 1st number");
		int n1= sc.nextInt();

		System.out.println("Please enter 2nd number");
		int n2= sc.nextInt();

		System.out.println("Please enter 3rd number");
		int n3= sc.nextInt();

		int a= checkGreatestOfThree(n1,n2, n3);
		if(a == (n1+n2+n3))
		{
			System.out.println("All are equal");
		}
		else
		{
			printResult(a,n1);
		}
		System.out.println("Main method ended");
	}


	//To Check greatest among 3
	public static int checkGreatestOfThree(int n1, int n2, int n3)
	{
		if(n1>n2 && n1>n3)
		{
			return n1;
		}
		else if(n2>n3 && n2>n1)
		{
			return n2;
		}
		else if(n3>n2 && n3>n1)
		{
			return n3;
		}
		
		else if(n3==n2 && n3==n1)
		{
			return n1+n2+n3;
		}

		else 
		{
			return 0;
		}

	}

	//To print the result
	public static void printResult(int a, int n1)
	{	
		if(a>0 || a<0)
		{
		System.out.println("Greates Number is: "+a);
		}
		else if(a==0)
		{
		System.out.println("2 Numbers, out of 3 numbers, are equal");
		}		
	}

}
