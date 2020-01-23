package com.tyss.assgn1;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		AssignmentConstructor ac= new AssignmentConstructor("Harendra", 24, 65000);
		System.out.println(ac.name+ "\n"+ ac.age +"\n" +ac.salary);
		
		ac.initialize("Sweta", 24, 80000);
		System.out.println(ac.name+ "\n"+ ac.age +"\n" +ac.salary);
		
		AssignmentConstructor ac1= new AssignmentConstructor();
		ac1.name="Megha";
		ac1.age=24;
		ac1.salary=45000;
		System.out.println(ac1.name+ "\n"+ ac1.age +"\n" +ac1.salary);
		
	}
}
