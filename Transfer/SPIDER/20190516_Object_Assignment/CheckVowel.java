import java.util.Scanner;
class IsVowel 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a char");
		char ch= sc.next().charAt(0);


		Vowel v= new Vowel();
		

		if(v.isVowel(ch))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not a Vowel");
		}

	}
}


class Vowel
{
	public boolean isVowel(char ch)
	{
		{
			if(ch=='A'|| ch=='a'||ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||ch=='O'|| ch=='o'||ch=='U'|| ch=='u')
				{
				return true;
				}

				else
				{
				return false;
				}
		}


	}
}
