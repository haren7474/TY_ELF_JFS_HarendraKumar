import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter a Char");
		char ch= sc.next().charAt(0);

		checkVowel(ch);
		
		System.out.println("Main Ends");
	}

	// To check if char is a vowel
	public static void checkVowel(char ch)
	{ 
		boolean b= false;
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||ch=='i' || ch=='I' ||ch=='o' || ch=='O' ||ch=='u' || ch=='U')
		{
		b=true;
		}

		printResult(b, ch);
	}

	// To print the result
	public static void printResult(boolean b, char ch)
	{
		if(b==true)
		{
		System.out.println(ch+" : is a vowel ");
		}
		else
		{
		System.out.println(ch+" : is not a vowel ");
		}
	}
}
