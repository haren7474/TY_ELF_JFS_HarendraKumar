package hebbal.abstracts.Uber;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

		while(true)
		{
		System.out.println("\n1. UberGO\n2. UberXL\n3. UberPrime\n4. Exit");		
		System.out.println("Please enter car choice");		
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: if(checkAvailability()) 
				{
				System.out.println(new UberFactory().getCarDetails("Ubergo").getPrice());
				System.out.println(new UberFactory().getCarDetails("Ubergo").getVehical());	
				}
		
				else
				{
				System.out.println(new UberFactory().getCarDetails("Ubergo").getPrice());
				System.out.println(new UberFactory().getCarDetails("UberPrime").getVehical());	
				}
				break;
				
		case 2: System.out.println(new UberFactory().getCarDetails("UberXL").getPrice());
				System.out.println(new UberFactory().getCarDetails("UberXL").getVehical());	
				break;
		
		case 3: System.out.println(new UberFactory().getCarDetails("UberPrime").getPrice());
				System.out.println(new UberFactory().getCarDetails("UberPrime").getVehical());	
				break;
		
		case 4: System.exit(0);
			
		default: System.out.println("invalid choice");
		}
		}
	}
	
	public static boolean checkAvailability()
	{
		int i=1;
		if(i==0)
		{
			return true;
		}
		
		else 
			return false;
	}
	
}
