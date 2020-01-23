package hebbal.abstracts.animal;

import java.util.Scanner;

abstract public class AnimalApp 
{
	public static void main(String[] args) 
	{		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("1. Dog\n2. Cat\n3. Lion\n4. Exit");
		System.out.println("Please enter your choice");
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: new Dog().sound();
				break;
				
		case 2: new Cat().sound();
		break;
		
		case 3: new Lion().sound();
		break;
		
		case 4: System.exit(0);
		break;
		
		default: System.out.println("Invalid Choice");
		break;
		
		}
		}
	}
  
}
