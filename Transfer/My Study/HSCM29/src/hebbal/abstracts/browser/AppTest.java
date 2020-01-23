//Same functionality as of Animal App but without Abstract
package hebbal.abstracts.browser;

import java.util.Scanner;

public class AppTest 
{
	public static String getBrowser(int arg)
	{
		if(arg==1)
		{
			return "Chrome";
		}
		else if(arg==2)
		{
			return "Opera";
		} 
		else if(arg==3)
		{
			return "Mozilla";
		}
		else
		{
			return "Incorrect";
		}
	}
	public static void main(String[] args) 
	{		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("1. Chrome\n2. Opera\n3. Mozilla\n4. Exit");
		System.out.println("Please enter your choice");
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println(getBrowser(ch));
				break;
				
		case 2: System.out.println(getBrowser(ch));
		break;
		
		case 3: System.out.println(getBrowser(ch));
		break;
		
		case 4: System.exit(0);
		break;
		
		default: System.out.println("Invalid Choice");
		break;
		

		}

		}
	}
  
}

