package edu.jspiders.programmingtest.test;

/* 
 * Print the Below Pattern
 * 
 * 				1
 * 			   *a*
 * 			  *bcd*
 * 			 2efghi3
 * 			  *JKL*
 * 			   *M*
 * 				4
 * 
 * 
 * marks --> 5
 */

class Question10
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
	
		printPattern(num);
	}

	public static void printPattern(int num) 
	{
		int stars = 1;
		int sp = num / 2;
		int n=1;
		char ch1='a';
		char ch2='A';
		for (int i = 1; i <= num; i++) 
		{
			for (int j = 1; j <= sp; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) 
			{
				if(j==1 && (i==1 ||i== num/2+1 || i==num) || (j==num && i== num/2+1))
				System.out.print(n++);
				
				else if(j==1 || j== stars)
					System.out.print("*");
				else if(i<= num/2+1)
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

			if (i <= num / 2) {
				stars = stars + 2;
				sp--;
			} else {
				stars = stars - 2;
				sp++;

			}
		}
	}	
}