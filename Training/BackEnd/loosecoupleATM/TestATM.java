package com.tyss.loosecoupleATM;

import java.util.Scanner;

public class TestATM {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ATM a = new ATM();
		SBI s = new SBI();
		HDFC h = new HDFC();

		while (true) 
		{
			System.out.println("1. HDFC\n2. SBI\n3. Exit");
			System.out.println("Please enter your choice");
			int ch = sc.nextInt();

			switch (ch) 
			{
			case 1:
				a.isWithdraw(h);
				break;

			case 2:
				a.isWithdraw(s);
				break;

			case 3:  
				System.exit(0);
				
			default: System.out.println("Invalid Choice");

			}
		}
	}

}
