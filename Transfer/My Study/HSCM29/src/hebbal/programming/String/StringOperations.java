package hebbal.programming.String;

import java.util.Scanner;

public class StringOperations 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");

		String s = sc.nextLine();
		System.out.println("Originol String: " + s);
	
		consonantVowelCount(s);
		upperLowerCaseCount(s);
		allFirstLetterUpperCase(s);
		onlyFirstLetterUpperCase(s);
		reverseString1(s);
		reverseString2(s); //sredipsj ot emocleW olleH
		reverseString3(s);
		findSubString(s);
		//upperCase(s);
		//swapCase(s);
	}
	
	public static void upperLowerCaseCount(String s) 
	{
		char[] ch = s.toCharArray();
		String res = "";
		int uCount=0;
		int lCount=0;
		
		for (int i = 0; i <ch.length; i++) 
		{	
			if((ch[i]>='A' && ch[i]<='Z'))
				uCount++;
			
			else if(ch[i]>='a' && ch[i]<='z')
				lCount++;
		}

		System.out.println("\nUpper Count: "+ uCount);
		System.out.println("Lower Count: "+ lCount);
	}
	
	public static void findSubString(String s) 
	{
		char[] ch1 = s.toCharArray();
		String res = "welcome";
		char [] ch2= res.toCharArray();
		
		for (int i = 0; i <ch1.length; i++) 
		{	
			int j=0;
			while( i< ch1.length && j< ch2.length && ch1[i]== ch2[j])
			{
				i++;
				j++;
			}
			
			if(j==ch2.length)
			{
				System.out.println("It is part of main string");
				return;
			}
		}
		System.out.println("It is not part of main string");
	}
	
	public static void onlyFirstLetterUpperCase(String s) 
	{
		char[] ch = s.toCharArray();
		String res = "";
		
		for (int i = 0; i <ch.length; i++) 
		{	
			if(i==0)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]= (char) (ch[i]-32);
				}
			}
			
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]= (char) (ch[i]+32);
			}
			
			res=res+ch[i];
		}
		System.out.println("\n----String with Only First Letter Upper:\n"+ res);
	
	}

	
	public static void allFirstLetterUpperCase(String s) 
	{
		char[] ch = s.toCharArray();
		String res = "";
		
		for (int i = 0; i <ch.length; i++) 
		{	
			if(i==0 || (ch[i]!=' ' && ch[i-1]==' '))
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]= (char) (ch[i]-32);
				}
			} 
			
			else if (ch[i]!=' ' && (ch[i]>='A' && ch[i]<='Z'))
			{
					ch[i]= (char) (ch[i] + 32);
			}
			
			res=res+ch[i];
		}
		System.out.println("\n----String with Each First Letter Upper: \n"+ res);
	
	}

	public static void consonantVowelCount(String s) 
	{
		char[] ch = s.toCharArray();
		String res = "";
		int vCount=0;
		int cCount=0;
		
		for (int i = 0; i <ch.length; i++) 
		{
			if(ch[i]=='A' || ch[i]=='a' || ch[i]=='E' || ch[i]=='e' || ch[i]=='I' || ch[i]=='i' || ch[i]=='O' ||ch[i]=='o' || ch[i]=='U' || ch[i]=='u')
			{				
				vCount++;
			}
			
			else if((ch[i]>='A' && ch[i]<='Z') || ch[i]>='a' && ch[i]<='z')
			{
				cCount++;
			}
		}

		System.out.println("\nVowel Count: "+ vCount);
		System.out.println("Consonant Count: "+ cCount);
	}
	
	public static void reverseString1(String s) 
	{
		String[] splited= s.split(" ");
		String res = "";

		for (int i = splited.length-1; i >= 0; i--) 
		{
			res = res + (splited[i] + " ");
		}
		
		System.out.println("\n\nReverse1 String: " + res);
	}
		
	public static void reverseString2(String s) 
	{
		char[] ch = s.toCharArray();
		String res = "";

		for (int i = ch.length - 1; i >= 0; i--) 
		{
			res = res + ch[i];
		}
		System.out.println("\nReverse2 String: " + res);

	}
	
	public static void reverseString3(String s) 
	{
		char temp = s.charAt(0);
		int j=0;
		for(int i=0; i< s.length()-1; i++)
		{
			if (i>0 && s.charAt(i-1)==' ' )
			{
				for(j=i; j< s.length();j++)
				{
					if (s.charAt(j-1)==' ')
					{
						s.replace(s.charAt(i), s.charAt(j));
						continue;
					}
				}
			}
			//s.replace(s.charAt(j-1), temp);
		}
		
		System.out.println("\nRotated String: "+ s);
	}
	
	public static void anagram(String s1, String s2) 
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int count1=0;
		int count2=0;
		if(ch1.length==ch2.length)
		{
			for(int i=0; i< ch1.length-1;i++)
			{
				for(int j=0; j< ch2.length-1;j++)
				{
					if(ch1[i]==ch2[j])
					{
						count1++;
					}
				}
				
				for(int j=0; j< ch2.length-1;j++)
				{
					if(ch2[i]==ch1[j])
					{
						count2++;
					}
				}
			}
		}
		else
			System.out.println("Not Anagram");
	}
	
	public static void upperCase(String s) 
	{
		String res = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char ch1 = (char) (s.charAt(i) - 32);
				res = res + ch1;
			} else
				res += s.charAt(i);
		}
		System.out.println("Upper Case: " + res);
	}

	public static void swapCase(String s)
	{
		String res = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) 
		{
			if (ch[i] >= 'a' && ch[i] <= 'z') 
			{
				 ch[i] = (char) (ch[i] - 32);
			} 
			
			else if (ch[i] >= 'A' && ch[i] <= 'Z') 
			{
				ch[i] = (char) (s.charAt(i) + 32);
			}
			
			res= res+ ch[i];
		}
		
		System.out.println("Swap Case: " + res);
	}
}
