package hebbal.programming.recursion;

import java.util.Scanner;

public class Fibonacci 
{
		static int n1=0;
		static int n2=1;
		static int n3;
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter Length");
			int len = sc.nextInt();

			System.out.println("fibonacciRecursion\n");
			System.out.print(n1+ " "+ n2+ " ");
			fibonacciRecursion(len-2);
			sc.close();
		}

		public static void fibonacciRecursion(int len)
		{		
			if(len>0)
			{	
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3+" ");
				fibonacciRecursion(len-1);
			}
		}
		
}
