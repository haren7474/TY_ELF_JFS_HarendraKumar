package hebbal.abstracts.browser;

import java.util.Scanner;

public class BrowserApp 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("1. Chrome\n2. Opera\n3. Mozilla\n4. Exit");
		System.out.println("Please enter your choice");
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: new Chrome().start();
				break;
				
		case 2: new Opera().start();
		break;
		
		case 3: new Mozilla().start();
		break;
		
		case 4: System.exit(0);
		break;
		
		default: System.out.println("Invalid Choice");
		break;
		

		}

		}
	}
  
}

