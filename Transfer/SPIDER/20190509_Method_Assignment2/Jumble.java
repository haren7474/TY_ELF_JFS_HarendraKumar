//Printing vowel cons with array of the string

import java.util.Scanner;
class Jumble
	{
		public static void main(String [] args)
			{
			System.out.println("Hello World");
			String str1= readString();
			String str2= readString();
			printResult(str1, str2);

			System.out.println("\nBye World");
			}


			public static String readString()
			{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter a String");
			String str= sc.nextLine();
			return str;
			}


			public static void printResult(String str1, String str2)
			{		
				for(int i=0; i<str1.length();i++)
				{
					System.out.print(str1.charAt(i));
					System.out.print(str2.charAt(i));
				}

			}		

	}