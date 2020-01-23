class Counting 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println("List of numbers b/n 1 and 100 is:");

		printCounting();
		
		System.out.println("Main Ends");
	}

	public static void printCounting()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
