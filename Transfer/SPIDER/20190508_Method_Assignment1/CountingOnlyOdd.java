class CountingOnlyOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		System.out.println("List of Odd numbers b/n 1 and 100 is:");

		printOnlyOdd();
		
		System.out.println("Main Ends");
	}

	public static void printOnlyOdd()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==1)
			System.out.println(i);
		}
	}
}
