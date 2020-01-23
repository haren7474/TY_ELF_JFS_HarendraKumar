package com.tyss.looseCoupleCrush;

import java.util.Scanner;

public class TestCrush 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Nokia n= new Nokia();
		Vivo v= new Vivo();
		OnePlus o= new OnePlus();
		Iphone i= new Iphone();

		while (true) 
		{
			System.out.println("1. Nokia\n2. Vivo\n3. OnePlus\n4. Iphone\n5.Exit");
			System.out.println("What do you want to gift???");
			int ch = sc.nextInt();

			switch (ch) 
			{
			case 1:
				n.reply();
				break;

			case 2:
				v.reply();
				break;

			case 3:
				o.reply();
				break;
				
			case 4: 
				i.reply();
				break;
			
			case 5:	System.exit(0);
				
			default: System.out.println("Invalid Choice");

			}
		}
	}

}
