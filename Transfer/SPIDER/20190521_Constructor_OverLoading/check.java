class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d= new Demo();
		//d.Demo();

		Demo d1= new Demo(10);// It will run as proper constructo found

		//Demo d2= new Demo(10.11);// It will give error as type mismatch, and double can't be promoted.

		Demo d3= new Demo('A');// Char will be promoted to Int so no error


	}
	
}

class Demo
{
	//As we write Void with Demo it becomes a method and we need to call it now, if we write static here then error.
	Demo() 
	{
		System.out.println("Harendra Defined Constructor");
	}

	Demo(int arg)
	{
		System.out.println("Integer Argument "+ arg);
	}
}
