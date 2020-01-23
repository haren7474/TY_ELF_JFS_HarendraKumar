//This Program checks if a given number, for which sum of factorial of the digits = number itself.

import java.util.Scanner;

class checkDigitFactorialSum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number, to calculate digit factorial sum");

int num= sc.nextInt();
int temp=num;
int sum=0;
int rem;

while(num>0)
{
rem= num%10;
int fact= factorial(rem);
System.out.println("Factorial of " + rem + " is "+ fact);
sum = sum+fact;
num=num/10;
}

System.out.println("Sum of all digits factorial of " + temp + " is "+ sum);
boolean b= checkPerfect(sum, temp);
System.out.println("Status of numer "+temp+" to be a perfect numer is "+b);

}

	public static boolean checkPerfect(int sum, int temp)
	{
	if(sum==temp)
	return true;
	else
	return false;
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
