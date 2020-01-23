package edu.web.tests;

public class StringCount {

	public static void main(String[] args) 
	{
		String str = "Hi Priya I am solving your question";

		String[] a = str.split(" ");
		System.out.println("# of words: " + a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " # of letters: " + a[i].length());
		}

		System.out.println("\n\n---Without using split function-----");
		String temp = "";
		str = str + " ";
		int temp1 = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);

				continue;
			}

			System.out.println(temp.length() - temp1 + " ");
			count++;
			temp1 = temp.length();
		}
		System.out.println("# of word: " + count);
	}
}
