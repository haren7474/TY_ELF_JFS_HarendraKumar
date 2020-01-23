import java.util.Scanner;

class Program 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Please enter a string");

		String s= sc.nextLine();
		String rev= Palindrom.isPalindrom(s);

		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(s+ " is a palindrom");
		}
		else
		{
			System.out.println(s+ " is a not palindrom");
		}
	}
}


class Palindrom
{
	public static String isPalindrom(String s)
	{	
		String rev="";
		for(int i= s.length()-1; i>=0 ; i--)
		{
			rev= rev+ s.charAt(i);
		}
	return rev;
	}

}