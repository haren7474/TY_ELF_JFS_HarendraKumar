package com.tyss.looseCoupling;

import java.util.Scanner;

public class TestCat 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	//Chips c= new Chips();
	Lays l= new Lays();
	Bingo b = new Bingo();
	Kurkure k= new Kurkure();
	
	Cat c1= new Cat();
	
	
	System.out.println("1. Bingo\n2. Lays\n3.Kurkure\n4. Exit");
	System.out.println("Please enter your choice");
	int ch= sc.nextInt();
	
	switch(ch)
	{
	case 1: c1.feedChips(b);
		break;
		
	case 2: c1.feedChips(l);
	break;
	
	case 3: c1.feedChips(k);
	break;
	
	case 4: System.exit(0);
		
	}
	
	
	}	
}
