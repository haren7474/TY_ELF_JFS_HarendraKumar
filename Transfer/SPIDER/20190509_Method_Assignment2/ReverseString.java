//Printing Reverse of the string



import java.util.Scanner;
class ReverseString
{

	public static void main(String [] args)
	{
	System.out.println("Main Method statrs\n");
	Scanner sc= new Scanner(System.in);

	System.out.println("Please enter a String");
	String str= sc.nextLine();

	reverseString(str);
	System.out.println("\nMain Method ends");
	}

	
	public static void reverseString(String str)
	{
	System.out.print("\nReverse String of " + str + " is: ");
	int len = str.length();
		for(int i= len-1;i>=0;i--)
			{
			System.out.print(str.charAt(i));
			}
	}


}
