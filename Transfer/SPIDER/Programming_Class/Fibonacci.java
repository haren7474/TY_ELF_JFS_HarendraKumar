import java.util.Scanner;

class Fibonacci 
{
	static int nun1=0;
	static int nun2=1;
	static int num3;
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Length");
		int len = sc.nextInt();

		if(len==0)
		{
			System.out.println(n1);
		}
		else if(len==1)
		{
			System.out.println(n1+ " "+ n2+ " ");
		}

		else
		{
			System.out.print(n1+ " "+ n2+ " ");
			for(int i=3; i<=len;i++)
			{
			n3=n1+n2;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
			}
		}
		System.out.println("fibonacciRecursion\n");
		fibonacciRecursion(len);

	}

	public static void fibonacciRecursion(int len)
	{		
		while(len>0)
		{	
			Fibonacci.num3=Fibonacci.num1+ Fibonacci.num2;
			System.out.print(Fibonacci.num3+ " ");
			Fibonacci.num1=Fibonacci.num2;
			Fibonacci.num2=Fibonacci.num3;
			fibonacciRecursion(len-1);
		}
	}
}
