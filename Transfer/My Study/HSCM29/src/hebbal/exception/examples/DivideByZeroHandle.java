package hebbal.exception.examples;

import java.util.Scanner;

public class DivideByZeroHandle 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n1");
		int x= sc.nextInt();
		
		System.out.println("Enter n2");
		int y= sc.nextInt();
		
		try
		{	
			System.out.println("Entering Try Block");
			System.out.println(x/y);
			System.out.println("Exiting Try Block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Entering Catch Block");
			System.out.println(e.getMessage());
			System.out.println("Exiting Catch Block");
		}
	} 
	
}
