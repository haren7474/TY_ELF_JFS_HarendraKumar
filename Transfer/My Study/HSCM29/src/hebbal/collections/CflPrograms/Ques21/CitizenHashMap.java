package hebbal.collections.CflPrograms.Ques21;

import java.util.Scanner;

public class CitizenHashMap 
{
	Scanner sc= new Scanner (System.in);
	
	public String readKey()
	{
		System.out.println("Please enter Voter Id#");
		return sc.next();
	}
	
	public Citizen readValues()
	{
		
		System.out.println("Please enter name");
		String name= sc.next();
		
		System.out.println("Please enter Age");
		int age= sc.nextInt();
		
		return new Citizen(name, age);
	}
	
}
