import java.util.Scanner;
class VowelName
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Please enter a string");
		String str= sc.nextLine();

		checkVowelName(str);
		
		System.out.println("Main Ends");
	}

	// To check if char is a vowel
	public static void checkVowelName(String str)
	{ 
		
		String vowel = "";
		String cons = "";
		for(int i=0; i< str.length(); i++)
		{
			char ch=str.charAt(i);			
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||ch=='i' || ch=='I' ||ch=='o' || ch=='O' ||ch=='u' || ch=='U')
			{
				vowel = vowel+ch;
			}
			else
			{
				cons += ch;
			}

		}
		System.out.println("\nList of vowel\n");
		System.out.println(vowel);

		System.out.println("\nList of Const\n");
		System.out.println(cons);

		
	}
	
}
