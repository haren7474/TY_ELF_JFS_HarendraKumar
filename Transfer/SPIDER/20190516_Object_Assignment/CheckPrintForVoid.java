class CheckPrintForVoid 
{
	public static void main(String[] args) 
	{
		Demo d= new Demo();
		System.out.println("Non Static x "+ d.x);
		System.out.println("Static y "+ Demo.y);

		Demo.demoS();
		d.demoNS();


		
	System.out.println("Here is the result for static funtions");
	System.out.println(Calculator.add(100,20));
	System.out.println(Calculator.sub(100,20));
	System.out.println(Calculator.mul(100,20));
	System.out.println(Calculator.div(100,20));

	
	CalculatorNS cns= new CalculatorNS();
	System.out.println("Here is the result for Non static funtions");
	System.out.println(cns.add(100,20));
	System.out.println(cns.sub(100,20));
	System.out.println(cns.mul(100,20));
	System.out.println(cns.div(100,20));


	}
}


class Demo
{
	int x=10;
	static int y=20;
	void demoNS()
	{
		System.out.println("This is Non Static Method");
	}

	static void demoS()
	{
		System.out.println("This is Static Method");
	}

}

class Calculator
{
	public static int add(int a, int b)
	{
		return a+b;
	}

	public static int sub(int a, int b)
	{
		return a-b;
	}

	public static int mul(int a, int b)
	{
		return a*b;
	}

	public static int div(int a, int b)
	{
		return a/b;
	}


}


class CalculatorNS
{
	public int add(int a, int b)
	{
		return a+b;
	}

	public int sub(int a, int b)
	{
		return a-b;
	}

	public int mul(int a, int b)
	{
		return a*b;
	}

	public int div(int a, int b)
	{
		return a/b;
	}


}
