class CheckBlock 
{
	static
	{
		System.out.println("This is a static Block in Class CheckBlock");
	}

	{
		System.out.println("This is a Non static Block in class CheckBlock");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Begins");
		new Block();
		new CheckBlock();
	}
	
}

class Block
{
	public static void staticMethod() 
	{
		System.out.println("This is a static Method");
	}

	public static void nonStaticMethod() 
	{
		System.out.println("This is a Non static Method");
	}

	static
	{
		System.out.println("This is a static Block in class Block");
	}


	{
		System.out.println("This is a Non static Block in class Block");
	}

}
