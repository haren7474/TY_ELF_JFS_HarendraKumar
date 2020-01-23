class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("Demo class main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

}


class Program3
{
	public static void main(String[] args)
	{
		System.out.println("Program1 class main");

		String [] s= {"Hello", "World"};
		String [] s1= {"1","2","3"};

		Demo3.main(s1);
	}
}