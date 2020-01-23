class Demo2
{
	public static void main(int[] args)
	{
		System.out.println("Integer Array agrument Demo2 Main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	
	public static void main(double[] args)
	{
		System.out.println("Double Array agrument Demo2 Main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	
	public static void main(char[] args)
	{
		System.out.println("Char Array agrument Demo2 Main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

	


	public static void main(String[] args)
	{
		System.out.println("String Array agrument Demo2 Main");

		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

}


class Program2
{
	public static void main(String[] args)
	{
		System.out.println("Program1 class main");

		int[] a= {10,20,30,40,50};
		char[] c= {'a','e','i','o','u'};
		double[] d= {10.11,20.15,53.1};
		String [] s= {"Hello", "World"};
		
		Demo2.main(a);
		Demo2.main(c);
		Demo2.main(d);
		Demo2.main(s);
	}
}