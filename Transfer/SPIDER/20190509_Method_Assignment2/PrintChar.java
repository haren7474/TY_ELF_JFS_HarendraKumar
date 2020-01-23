//Printing printCharByChar of the string


import java.util.Scanner;
class PrintChar
{
	public static void main(String [] args)
	{
	System.out.println("Main Method	statrs\n");
	Scanner	sc=	new	Scanner(System.in);

	System.out.println("Please enter a String");
	String str=	sc.nextLine();

	printCharByChar(str);
	System.out.println("\nMain Method ends");
	}



	public static void printCharByChar(String str)
	{
	System.out.print("\nChar by	Char data of " + str + " is:\n");

	int	len	= str.length();
	for(int	i= 0;i<	len;i++)
		{
		System.out.print(str.charAt(i)+" ");
		}

	}
}