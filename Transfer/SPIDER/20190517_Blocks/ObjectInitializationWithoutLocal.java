class MainInitialize
{
	
	static
	{
		int x=60;
		double y=60.33;
		System.out.println("\n***Static Block Execution in Main***");
		System.out.println("Values of x in static Block of Main is: "+ x);
		System.out.println("Values of y in static Block of Main is: "+ y);
	}


	{
		int x=70;
		double y=70.33;
		System.out.println("\n***Static Block Execution in Main***");
		System.out.println("Values of x in Non static Block of Main is: "+ x);
		System.out.println("Values of y in Non static Block of Main is: "+ y);
	}

	public static void main(String[] args) 
	{
		System.out.println("\nMain Method Begins");
		Demo d= new Demo();	
		Demo.m1();
		d.m2();
		new MainInitialize();


		System.out.println("\n***Non Static Block Execution in Test***");
		Test t = new Test();
		t.m2();
	}
	
}

class Demo
{
	//Static Data Members can be used for Static as well as Non Static Members.
	static int x=10;
	static double y=10.11;

	public static void m1()
	{
		x=20;
		y=20.22;
		System.out.println("Values of x in m1 is: "+ x);
		System.out.println("Values of y in m1 is: "+ y);
	}

	static
	{
		x=30;
		y=30.33;
		System.out.println("Values of x in static Block of Demo is: "+ x);
		System.out.println("Values of y in static Block of Demo is: "+ y);
	}

	public void m2()
	{
		x=40;
		y=40.22;
		System.out.println("Values of x in m2 is: "+ x);
		System.out.println("Values of y in m2 is: "+ y);
	}

	
	{
		x=50;
		y=50.33;
		System.out.println("Values of x in Non static Block of Demo is: "+ x);
		System.out.println("Values of y in Non static Block of Demo is: "+ y);
	}

}

class Test
{
	//Non Static Data Members can be used only for Non Static Members.
	int x=10;
	double y=10.11;

	public void m2()
	{
		x=80;
		y=80.22;
		System.out.println("Values of x in m2 is: "+ x);
		System.out.println("Values of y in m2 is: "+ y);
	}

	
	{
		x=90;
		y=90.33;
		System.out.println("Values of x in Non static Block of Test is: "+ x);
		System.out.println("Values of y in Non static Block of Test is: "+ y);
	}

}
