package hebbal.programming.recursion;

import java.util.Scanner;

public class DecimalToBinary 
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	int n= sc.nextInt();
	sc.close();

	
	System.out.println("binary");
	binary(n);
	
	System.out.println("octal");
	octal(n);
	
	System.out.println("binaryToDecimal");
	binaryToDecimal(n);
	
	System.out.println("hexadecimal");
	hexadecimal(n);
	}
	
	 public static void binaryToDecimal(int n)
     {
		 int num=n;
		 int sum=0;
		 int rem=0;
		 int i=0;
		
		while(num>0)
		{
		  rem= num%10;
		  sum= sum+ rem*(powerOfDigit(i, 2));
		  i++;
		  num=num/10;
		}		 
		System.out.println(sum);
     }

	 public static int powerOfDigit(int digit, int rem)
		{
			int product=1;
			for(int i=0; i<digit;i++)
			{
				product= product*rem;
			}
				return product;
		}

	private static void hexadecimal(int n) 
	{
		int temp = 0;
		char ch;
		if(temp==10)
		{
			ch='A';
		}
		else if(temp==11)
		{
			ch='B';
		}
		else if(temp==12)
		{
			ch='C';
		}
		else if(temp==13)
		{
			ch='D';
		}
		else if(temp==14)
		{
			ch='E';
		}
		else if(temp==15)
		{
			ch='F';
		}
		
		
		int quo=0;
		
		while(n>0)
		{
			quo= n/8;
			n= n%8;
			hexadecimal(quo);
			System.out.print(n);
			n=n/8;
		}
	}

	public static void binary(int n)
	{
	int quo=0;
	
	while(n>0)
	{
		quo= n/2;
		n= n%2;
		binary(quo);
		System.out.print(n);
		n=n/2;
	}
	}
	
	public static void octal(int n)
	{
	int quo=0;
	
	while(n>0)
	{
		quo= n/8;
		n= n%8;
		binary(quo);
		System.out.print(n);
		n=n/8;
	}
	}
}
