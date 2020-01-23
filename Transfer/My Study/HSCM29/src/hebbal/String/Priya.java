package hebbal.String;

import java.util.Scanner;

public class Priya {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s3 = "Hi Hello How are you";
		
		String[] strArray = s3.split(" ");
		
		System.out.println("No of words: "+ strArray.length);
		
		System.out.println("Please enter word to check");
		String s= sc.next();
		
		for (int i = 0; i < strArray.length; i++) 
		{
			if (strArray[i].equalsIgnoreCase(s)) 
			{
				System.out.println(s+ " is present at the index " + i);

			}
		}

	}

}
