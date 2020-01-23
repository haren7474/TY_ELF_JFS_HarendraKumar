package hebbal.abstracts.restaurant;

import java.util.Scanner;

public class Waiter 
{
	public Kitchen getFood(String food)
	{
		Kitchen kitchenObj= null;
			
		if(food.equalsIgnoreCase("Desert"))
		{	

			kitchenObj= new Desert();
		}
		
		else if(food.equalsIgnoreCase("Dishes"))
		{	

			kitchenObj= new Dishes();
		}
		
		else if(food.equalsIgnoreCase("Drinks"))
		{	

			kitchenObj= new Drinks();
		}
		
		else if(food.equalsIgnoreCase("Biryani"))
		{	

			kitchenObj= new Biryani();
		}
		
		else if(food.equalsIgnoreCase("Starters"))
		{	

			kitchenObj= new Starters();
		}
		
		else
		{	

			kitchenObj= new Breads();
		}
				
		return kitchenObj;
	}
	
	public static String[] extraFood(int itemCount)
	{	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
				
		String [] extraFoodArray = new String[itemCount];	
		
		Customer.displayFoodSubMenu();
		
		for(int i=0;i<itemCount;i++)
		{
			System.out.println("Please Enter Item# "+(i+1));
			int extraFood= sc.nextInt();
			if(extraFood==1)
			{
			extraFoodArray[i]= new Starters().cook();
			}
			
			else if(extraFood==2)
			{
			extraFoodArray[i]= new Biryani().cook();;
			}
			
			else if(extraFood==3)
			{
			extraFoodArray[i]= new Dishes().cook();
			}
			
			else if(extraFood==4)
			{
			extraFoodArray[i]= new Breads().cook();
			}
			
			else if(extraFood==5)
			{
			extraFoodArray[i]= new Drinks().cook();
			}
			
			else
			{
			extraFoodArray[i]= new Desert().cook();
			}
			
		}
		
		return extraFoodArray; 
		
	}

}
