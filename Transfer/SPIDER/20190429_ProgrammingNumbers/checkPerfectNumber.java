// This programs checks if a given number is perfect number i.e. sums of its digits = number itself.

import java.util.Scanner;

class checkPerfectNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number");
int num = sc.nextInt();
int sum=0;

	for(int j=1; j<num;j++)
	{
		if(num%j==0)
		{
		sum= sum+j;
		}
	}
	
	if(sum==num)
	{
	System.out.println("it is a perfect number");
	}
	
	else
	{ System.out.println(sum + "it is not a perfect number");	
	}


System.out.println("Outper loop close");
	
}
}
