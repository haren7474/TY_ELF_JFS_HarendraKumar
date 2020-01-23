package hebbal.abstracts.defence;

import java.util.Scanner;

public class DefenceMinister 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		SoldierFactory sf = new SoldierFactory();
		
		while (true) 
		{
			System.out.println("----------------------");
			System.out.println("1. Air Strike\n2. Water Strike\n3. Land Strike\n4. No Attack, exit");
			System.out.println("----------------------");
			System.out.println("\n\nRespected Defence Minister, please select what kind of attack it is>>>>>>>>>>");
			int attackType = sc.nextInt();
		
			int landCount=0, airCount=0, waterCount=0;
			String air=null, water=null, land=null;
			
			air = sf.getSoldierDetails("Air").getBackup();
			airCount = sf.getSoldierDetails("Air").soldierCount();
			
			water = sf.getSoldierDetails("Water").getBackup();
			waterCount = sf.getSoldierDetails("Water").soldierCount();
			
			land = sf.getSoldierDetails("Land").getBackup();
			landCount = sf.getSoldierDetails("Land").soldierCount();
			
			switch (attackType) 
			{
			case 1:		
				System.out.println(air + " with soldier count " + airCount);
				if(!checkMoreBackup())
				{
					System.out.println("\nIndia won!!!!");
				}
				else
				{
					System.out.println(land + " additional backup with soldier count " + landCount);
					System.out.println(water + " additional backup with soldier count " + waterCount);
					System.out.println("\nIndia won!!!!");
				}
					
				break;

			case 2:	
				System.out.println(water + " with soldier count " + waterCount);
				if(!checkMoreBackup())
				{
					System.out.println("\nIndia won!!!!");
				}
				else
				{
					System.out.println(land + " additional backup with soldier count " + landCount);
					System.out.println(air + " additional backup with soldier count " + airCount);
					System.out.println("\nIndia won!!!!");
				}
				break;

			case 3:
				System.out.println(land + " with soldier count " + landCount);
				if(!checkMoreBackup())
				{				
					System.out.println("\nIndia won!!!!");
				}
				else
				{					
					System.out.println(water + " additional backup with soldier count " + waterCount);
					System.out.println(air + " additional backup with soldier count " + airCount);
					System.out.println("\nIndia won!!!!");
				}
				break;

			case 4:
				System.exit(0);
			
			default: System.out.println("Invalid choice");

			}
		}
	}
	
	public static boolean checkMoreBackup()
	{
		System.out.println("Do you need more backup?? Please Enter Y/N");
		char c= sc.next().charAt(0);
		if(c=='Y' || c=='y')
			return true;
		else return false;	
	}

}
