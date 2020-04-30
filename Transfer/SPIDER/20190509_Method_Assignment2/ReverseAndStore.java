//Printing vowel cons with array of the string

import java.util.Scanner;
class ReverseAndStore
	{
		public static void main(String [] args)
			{
			System.out.println("Hello World");

			String str= readString(); //Reading Input
			String res= reverseString(str); // Reverse of String 
			printResult(str, res); // Printing Result
			checkPalindrom(str,res);// Checking Palindrom
			checkPalindrom1(str,res);// Checking Palindrom with equal function
			checkPalindrom2(str,res);// Checking Palindrom with equals ignore function

			System.out.println("\nBye World");
			}


			public static String readString()
			{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter a String");
			String str= sc.nextLine();
			return str;
			}


			public static String reverseString(String str)
			{
				String s="";
				for(int i=str.length()-1; i>=0;i--)
				{
					s=s + str.charAt(i);
				}
				return s;

			}
			
			public static void printResult(String str, String res)
			{
			System.out.println("\nYour String: "+ str);

			System.out.println("Reserse String: "+ res);
			
			}

			public static void checkPalindrom(String str, String res)
			{

				int count=0;
				for(int i=str.length()-1; i>=0;i--)
					{
					if(str.charAt(i)!=res.charAt(i))
						{
						count++;
						}
					}
				
				if(count==0)
				{
				System.out.println(str+" is  a palindrom\n");
				}
				else 
				{
				System.out.println(str+" is not a palindrom\n");
				}

			}

			public static void checkPalindrom1(String str, String res)
			{				
				if(str.equals(res))
				{
				System.out.println(str+" is  a palindrom  by palindrom1 function\n");
				}
				else 
				{
				System.out.println(str+" is not a palindrom  by palindrom1 function\n");
				}

			}

			public static void checkPalindrom2(String str, String res)
			{				
				if(str.equalsIgnoreCase(res))
				{
				System.out.println(str+" is  a palindrom by palindrom2 function\n");
				}
				else 
				{
				System.out.println(str+" is not a palindrom  by palindrom2 function\n");
				}

			}



	}