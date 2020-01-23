class Demo1
{
	public static void main()
	{
		System.out.println("No Argument Main");
	}

	public static void main(int args)
	{
		System.out.println("Int Argument Main"+ args);
	}

	public static void main(double args)
	{
		System.out.println("Double Argument Main"+ args);
	}

	public static void main(String args)
	{
		System.out.println("String Argument Main"+ args);
	}


	public static void main(String[] args)
	{
		System.out.println("String Array agrument Demo1 Main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

}


class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Program1 class main");

		Demo1.main();
		Demo1.main(10);
		Demo1.main(10.11);
		Demo1.main('A');
		Demo1.main("Harendra");
		Demo1.main(1000l);
		Demo1.main(2.14f);

		String [] s= {"Hello", "World"};
		Demo1.main(s);
	}
}