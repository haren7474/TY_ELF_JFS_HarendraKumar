package hebbal.String;

import java.util.Scanner;

public class StringDemo1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1. Calculating number of letters in each word of String\n2. Calculating same as 1 without split\n3. Function\n4. Checking a word count in String\n5. Calculating same as 2 with array\n10. Exit");
		System.out.println("Please enter you choice");
		int choice = sc.nextInt();

		String s = "Java Developers";

		String s1 = new String("Hello");
		String s2 = new String("hello");
		String s3 = "I love Java I love Python";
		
		switch (choice) 
		{
		case 1:
			countLetterOfWordsInStringWithSplit(s3);
			break;

		case 2:
			countLetterOfWordsInStringWithoutSplit(s3);
			break;

		case 3: 
			// Simple use of methods
			System.out.println("\n****Simple use of methods***");
			System.out.println("length =" + s.length());
			System.out.println(s.indexOf('e'));
			break;

		case 4: countWordInString(s3);
			break;
			
		case 5: stringToArray();
				break;

		case 10: System.exit(0);
				break;

		default:System.out.println("Invalid choice");
				break;
		}
	}

	private static void countWordInString(String s3) {
		// -----------------------Checking a word count in
				// String----------------------------------------
				System.out.println("\n****************");
				String[] strArray = s3.split(" ");
				int count = 0;
				for (int i = 0; i < strArray.length; i++) {
					if (strArray[i].equalsIgnoreCase("Love")) {
						count++;
					}
				}

				System.out.println("In the String " + s3 + " count of love is :>>" + count);
		
	}

	private static void countLetterOfWordsInStringWithoutSplit(String s3) 
	{
		// --------------Calculating number of letters in each word of String s4 WITHOUT
		// SPLIT----------------
		System.out.println("\n*******Calculating WITHOUT SPLIT*********");
		String s4 = "I love Java and python I am Harendra Kumar";
		int n1 = -1, n2 = 0, n3 = 0;

		for (int j = 0; j < s4.length(); j++) {
			if (s4.charAt(j) == ' ') {
				n2 = j;// For Last Word Length
				n3 = j - n1; // Calculating difference b/n index of two consicutive spaces
				System.out.println(n3 - 1); // print
				n1 = j; // Saving index of current space
			}
		}

		System.out.println(s4.length() - n2 - 1); // Print length of last word.

	}

	private static void countLetterOfWordsInStringWithSplit(String s3) 
	{

		// --------------Calculating number of letters in each word of String
		// s3.----------------
		System.out.println("\n*****Calculating number of letters in each word of String s3 with Split***********");
		String[] strArray1 = s3.split(" ");
		for (int i = 0; i < strArray1.length; i++) {
			System.out.println(strArray1[i] + " contains " + strArray1[i].length() + " letters");
		}

	}

	public static void stringToArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter a string");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println();
				continue;
			}
			System.out.print(str.charAt(i));
		}
		sc.close();
	}
}
