package hebbal.programming.patterns;

import java.util.Scanner;

public class PatternAssignment2 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Pattern 1\n2. Pattern 2\n3. Pattern 3\n"
				+ "4. Pattern 4\n5. Pattern 5\n6. Pattern 6\n7. Pattern 7\n8. Pattern 8\n"
				+ "9. Pattern 9\n10. Pattern 10\n11. Pattern 11\n12. Pattern 12\n13. Pattern 13\n"
				+ "14. Pattern 14\n15. Pattern 15\n16. Pattern 16\n"
				+ "17. Pattern 17\n18. Pattern 18\n19. Pattern 19\n20. Pattern 20\n21. Print All\n22. Exit");

		System.out.println("Please enter length for pattern");
		int len = sc.nextInt();

		while (true) {
			System.out.println("\nPlease enter your choice\n");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				pattern1(len);
				break;

			case 2:
				pattern2(len);
				break;

			case 3:
				pattern3(len);
				break;

			case 4:
				pattern4(len);
				break;

			case 5:
				pattern5(len);
				break;

			case 6:
				pattern6(len);
				break;

			case 7:
				pattern7(len);
				break;

			case 8:
				pattern8(len);
				break;

			case 9:
				pattern9(len);
				break;

			case 10:
				pattern10(len);
				break;

			case 11:
				pattern11(len);
				break;

			case 12:
				pattern12(len);
				break;

			case 13:
				pattern13(len);
				break;

			case 14:
				pattern14(len);
				break;	
				
			

		
				
			case 21:
				pattern1(len);
				pattern2(len);
				pattern3(len);
				pattern4(len);
				pattern5(len);
				pattern6(len);
				pattern7(len);
				pattern8(len);
				pattern9(len);
				pattern10(len);
				pattern11(len);
				pattern12(len);
				pattern13(len);
				pattern14(len);
				
				break;

			case 22:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	private static void pattern1(int len) {
		System.out.println("\n----------Pattern 1----------\n");
		int space = len - 1;

		for (int i = 1; i <= len; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int n = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(n++);
			}

			System.out.println();
			space--;
		}
	}

	private static void pattern2(int len) {
		System.out.println("\n----------Pattern 2----------\n");
		int space = len - 1;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" ");
			}
	
			for (int j = space+1; j <=len ; j++) 
			{
				System.out.print(j);
			}

			System.out.println();
			space--;
		}

	}
	

	private static void pattern3(int len) {
		System.out.println("\n----------Pattern 3----------\n");
		int space = len - 1;
		int n = 1;
		char ch1 = 'A';
		char ch2 = 'a';
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++)
			{
				if ((k == 1 && i == 1) || (i == len && k == 1) || (k == len && i == len)) {
					System.out.print("*");
				} 
				else if (k == 1) 
				{
					System.out.print(ch1++);
					ch2++;
				} 
				else if (k == i) 
				{
					System.out.print(ch2++);
					ch1++;
				} 
				else 
				{
					System.out.print(n++);
				}
			}

			System.out.println();
			space--;
		}
	}

	private static void pattern4(int len) {
		System.out.println("\n----------Pattern 4----------\n");
		int space = len - 1;
		char ch1 = 'A';
		char ch2 = 'a';
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				if ((k == 1) || (k == i)) {
					System.out.print(ch1++);
					ch2++;
				} else {
					System.out.print(ch2++);
					ch1++;
				}
			}

			System.out.println();
			space--;
		}
	}

	private static void pattern5(int len) {
		System.out.println("\n----------Pattern 5----------\n");
		int space = len - 1;
		int n = 1;
		int count = 1;
		char ch = 'A';
		for (int i = 1; i <= len; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (count % 2 == 1) {
					System.out.print(n++);
				} else {
					System.out.print(ch++);
				}
				count++;
			}

			System.out.println();
			space--;
		}
	}

	private static void pattern6(int len) 
	{
		System.out.println("\n----------Pattern 6----------\n");
		int space = len - 1;
		char ch1 = 'B';
		char ch2 = 'a';
		char ch3 = 'a';
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				if ((k == 1 && i == 1) || (i == len && k == 1) || (k == len && i == len)) {
					System.out.print(ch3++);
				} else if ((k == 1) || (k == i)) {
					System.out.print(ch1++);
				} else {
					System.out.print(ch2++);
				}
			}

			System.out.println();
			space--;
		}
	}

	private static void pattern7(int len) 
	{
		System.out.println("\n----------Pattern 7----------");

		int n = 0;
		int sp=1;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= sp; j++)
			{
				if (i <= len / 2 +1) 
				System.out.print(++n + " ");
				else
				System.out.print(--n + " ");
			}
			if (i <= len / 2) 	
				++sp;
			 else 
				 --sp;
			
			System.out.println();
		}
	}

	private static void pattern8(int len) 
	{
		System.out.println("\n----------Pattern 8----------");

		int stars = 1;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= stars; j++) 
			{
				if(j==1|| j==stars)
				System.out.print("*");
				else System.out.print(" ");
			}
			if (i <= len / 2) 
			{
				stars++;
			} else 
			{
				stars--;
			}
			System.out.println();
		}
	}

	private static void pattern9(int len) 
	{
		System.out.println("\n----------Pattern 9----------");

		int col=len/2+1;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= col; j++) 
			{
				if ((j == 1) || (j == col) || (i==1) || (i==len) || (i==j) || (i+j==len+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static void pattern10(int len) 
	{
		System.out.println("\n----------Pattern 10----------");
		char ch1 = 'A';
		char ch2= 'a';
		
		int stars = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= stars; j++) 
			{
				if (i <= len / 2+1) 
				{
				System.out.print(ch2++);
				ch1++;
				}
				else
				System.out.print(ch1++);
			}
			if (i <= len / 2) 
			{
				stars++;
				//ch2++;
			} else {
				stars--;
			}
			System.out.println();
		}
	}

	private static void pattern11(int len) 
	{
		System.out.println("\n----------Pattern 11----------");

		char ch1= 'a';
		int stars = 1;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= stars; j++) 
			{
				if(j==1|| j==stars)
				System.out.print("* ");
				else System.out.print(ch1++ +" ");
			}
			if (i <= len / 2) 
			{
				stars++;
			} else 
			{
				stars--;
			}
			System.out.println();
		}
	}

	private static void pattern12(int len) 
	{
		System.out.println("\n----------Pattern 12----------");

		
	}

	private static void pattern13(int len) 
	{
		System.out.println("\n----------Pattern 13----------");

		
	}



	public static void pattern14(int len)
	{
		System.out.println("\n----------Pattern 14----------");

		

	}
}
