package hebbal.programming.patterns;

import java.util.Scanner;

public class Pattern_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your choice\n1. Pattern 1\n2. Pattern 2\n3. Pattern 3\n"
				+ "4. Pattern 4\n5. Pattern 5\n6. Pattern 6\n7. Pattern 7\n8. Pattern 8\n15. Exit\n");
		int choice = sc.nextInt();

		System.out.println("Please enter length for pattern");
		int len = sc.nextInt();
		sc.close();

		switch (choice) {
		case 1:
			qPattern1(len);
			break;

		case 2:
			qPattern2(len);
			break;

		case 3:
			qPattern3(len);
			break;


		case 7:
			qPattern7(len);
			break;

		case 8:
			qPattern8(len);
			break;
			
		case 15:
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
			break;

		}
	}

	
	public static void qPattern1(int len) 
	{
		System.out.println("\n---------Ques Pattern 1-------------");
		int stars = 1;
		int sp = len / 2;
		
		char ch1='A';
		char ch2= 'a';
		
		for (int i = 1; i <= len; i++)
		{
			for (int j = 1; j <= sp; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) 
			{
				if(((j<=i) && (i<=len/2+1)) || ((j<i) && (i>=len/2+1))  )
				{
				System.out.print(ch1++);
				ch2++;
				}
				else
				{
					System.out.print(ch2++);
					ch1++;
				}
			}

			System.out.println();

			if (i <= len / 2) 
			{
				stars = stars + 2;
				sp--;
			}
			else 
			{
				stars = stars - 2;
				sp++;

			}
		}
	}

	public static void qPattern3(int len) 
	{
		System.out.println("\n----------Ques Pattern 3----------");

		int n = 0;
		int sp=1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= sp; j++)
			{
				if (i <= len / 2+1) 
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

	public static void qPattern2(int len) {
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

	public static void qPattern7(int len)
	{
		for(int i=1;i<=len;i++)
		{
			for(int j=1; j<=len;j++)
			{
				if( (i==1) || (i==len) || (j==1) || (j==len)  || (i==j) ||(i+j==len+1) )
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void qPattern8(int len)
	{
		for(int i=1;i<=len;i++)
		{
			for(int j=1; j<=len;j++)
			{
				if( (i==1) || (i==len) || (j==1) || (j==len)  || (i==len/2+1) ||(j==len/2+1) )
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
