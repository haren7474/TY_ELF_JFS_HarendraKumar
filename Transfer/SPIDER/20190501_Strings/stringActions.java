class stringActions
{
	public static void main(String[] args) 
	{
		String s1= "Hello how are you";

		System.out.println(s1.length()+ " This is string length\n");
		System.out.println(s1.charAt(0) + " This is char present at zero index\n");


		//Printing String as it is with for loop
		System.out.println("****Printing String as it is with for loop****\n\n");

		for(int i=0; i< s1.length(); i++)
		{
			System.out.print(s1.charAt(i));
		}
		


		//Reverse of a string
		System.out.println("\n************Reverse String********\n\n");

		for(int i=s1.length()-1; i>=0; i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		//Printing Reverse but word intact
		System.out.println("\n********Printing: You are how hello********\n\n");
		String[] a1= s1.split(" ");
		//System.out.print(s1.length());
		//System.out.print(a1.length);
		//System.out.print(" ");

		for(int i=a1.length-1; i>=0;i--)
		{
					System.out.print(a1[i]+" ");
		}


		//Printing wirh same order just words revers
		System.out.print("\n*********Printing: olleH woh era uoY*****\n\n");
		for(int i=0; i<a1.length;i++)
		{
			for(int j=a1[i].length()-1; j>=0; j--)
			{
					System.out.print(a1[i].charAt(j));
			}
			System.out.print(" ");
		}



		System.out.println("\n************************************Practise***********************************************\n\n");


		String str= "My name is Harendra";
		int len= str.length();
		System.out.println(len);
		String[] arr= str.split(" ");

		for(int i=0; i<arr.length;i++)
		{
		 System.out.print(arr[i]+" ");
		}

		System.out.println();

		for(int i=arr.length-1; i>=0;i--)
		{
		 System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=str.length()-1; i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

		System.out.println();

		for(int i=0; i<arr.length;i++)
		{
			for(int j=arr[i].length()-1; j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}

		System.out.print(" ");

		}


}
}
