package hebbal.exception.examples;

import java.util.Scanner;

public class TryWithMultipleCatch 
{
	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter n1");
	int x= sc.nextInt();
	
	System.out.println("Enter n2");
	int y= sc.nextInt();
	
	int [] a= new int[5];
	try
	{	
		System.out.println("Entering Try Block");
		System.out.println(x/y);
		a[5]=100;
		System.out.println("Exiting Try Block");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Entering Catch Block of AE");
		System.out.println(e.getMessage());
		System.out.println("Exiting Catch Block of AE");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Entering Catch Block of AIOFE");
		System.out.println("Exception at index:>> "+ e.getMessage());
		System.out.println("Exiting Catch Block AIOFE");
	}
} 

}
