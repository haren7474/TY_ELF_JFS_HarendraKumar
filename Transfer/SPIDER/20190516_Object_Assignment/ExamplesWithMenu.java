class ExamplesWithMenu 
{

	//1.--First of all Static member of this class with be accessed implicitly
	//Hence Values of Y in Static Block will be printed at the very beginging


	//2.  Now JVM will look for Main Method
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		//Accessing Static Members
		System.out.println("Values of X in Static Data Member is: "+ StaticMembers.x);
		int sum = StaticMembers.staticFunction(20,10);
		System.out.println("Sum of a and b is: "+sum);

		
		//Accessing Nnn Static Members
		NonStaticMembers nsm= new NonStaticMembers();
		System.out.println("Values of X in Non Static Data Member is: "+ nsm.x);
		int diff = nsm.nonStaticFunction(20,10);
		System.out.println("Diff of a and b is: "+diff);
		
		
		//Creating Object of ExamplesWithMenu Class to access Non Static block of same class
		new ExamplesWithMenu();
		
		System.out.println("Bye World!");
	}

		static
		{
		int y= 1000;
		System.out.println("Values of Y in Static Block is: "+ y);
		}
		
		{
		int z= 1;
		System.out.println("Values of Z in Non Static Block is: "+ z);
		}

		
}

class StaticMembers
{
	//Static Data Member
	static int x= 10;
	
	//Static Method
	public static int staticFunction(int a, int b)
	{
		return a+b;
	}

	//Static Block
	static
	{
		int x= 1000;
		System.out.println("Values of X in Static Block is: "+ x);
	}

}


class NonStaticMembers
{
	//Non Static Data Member
	int x= 10;

	//Non Staic Method
	public int nonStaticFunction(int a, int b)
	{
		return a-b;
	}

	//Non Static Block
	{
		int x= 100;
		System.out.println("Values of X in Non Static Block is: "+ x);
	}
}
