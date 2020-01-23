package hebbal.abstracts.restaurant;

import java.util.Scanner;


public class Customer 
{
	
	public static void main(String[] args) 
	{		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		displayFoodMenu();
		System.out.println("Please enter your choice");
		int ch= sc.nextInt();
		//String orderedFood[]= {"Starters, Biryani, Dishes, Breads, Drinks, Desert"};
		//String passOrder[] = null;
		
		switch(ch)
		{
		case 1: System.out.println(new Waiter().getFood("Starters").cook());
				break;
				
		case 2: System.out.println(new Waiter().getFood("Biryani").cook());
				break;
		
		case 3: System.out.println(new Waiter().getFood("Dishes").cook());
				break;
				
		case 4:	System.out.println(new Waiter().getFood("Breads").cook());
				break;
				
		case 5:	System.out.println(new Waiter().getFood("Drinks").cook());
				break;				
				
		case 6:	System.out.println(new Waiter().getFood("Desert").cook());
				break;
				
		case 7: System.out.println("How many items you want to order");
				int itemCount= sc.nextInt();
				String[] arr= Waiter.extraFood(itemCount);
				
				System.out.println(">>Here is your Order>>>");
				for (int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+ " ");
				}
		
		case 8: System.exit(0);
				break;
		
		default: System.out.println("Invalid Choice");
				break;

		}

		}
	}
	
	public static void displayFoodMenu()
	{
		System.out.println("\n-------\n1. Starters\n2. Biryani\n3. Dishes\n4. Breads\n5. Drinks\n6. Desert\n7. Order Multiple Items\n8. Exit\n------");
	}
	
	public static void displayFoodSubMenu()
	{
	System.out.println("\n-------\n1. Starters\n2. Biryani\n3. Dishes\n4. Breads\n5. Drinks\n6. Desert\n7. Exit\n------");
	}
}
