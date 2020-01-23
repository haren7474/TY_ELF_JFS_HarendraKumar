package hebbal.constructor.calculator;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			
		System.out.println("\nPlease enter 1st Number");
		int n1= sc.nextInt();
		
		System.out.println("\nPlease enter 2nd Number");
		int n2= sc.nextInt();
				
		System.out.println("\n\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
		System.out.println("\nPlease enter your choice");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1: new Addition(n1, n2).calculation();
				break;
		case 2: new Subtraction(n1, n2).calculation();
				break;
		
		case 3: new Multiplication(n1, n2).calculation();
				break;
		
		case 4: new Division(n1, n2).calculation();
				break;
				
		case 5: System.exit(0);
		
		default: System.out.println("Invalid choice");
		}
		
		}				
	}

}
