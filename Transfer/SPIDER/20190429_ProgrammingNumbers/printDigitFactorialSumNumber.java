//This Program prints those number from given range, for which sum of factorial of the digits = number itself.

import java.util.Scanner;

class printDigitFactorialSumNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter lower limit");
int low= sc.nextInt();


System.out.println("Please enter upper limit");
int up= sc.nextInt();

System.out.println("List of such numbers is:");

for(int i= up; i>=low; i--)
	{

	int sum=0;
	int rem;
	for(int j= i; j>=1;)
		{
		rem= j%10;
		int fact= factorial(rem);
		sum = sum+fact;
		j=j/10;
		}
			if(sum==i)
			{
			System.out.println(i);
			}
	}
}

	public static int factorial(int n)
	{
	int mult = 1;
	while(n>0)
	{
	mult= mult*n;
	n--;

	}
	return mult;
	}



}
