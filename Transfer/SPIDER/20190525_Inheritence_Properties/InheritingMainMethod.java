class InheritingMainMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

class B extends InheritingMainMethod
{
	//Main Method inherited from class InheritingMainMethod
{
}
}

class C
{
	//Main Method Not found error
}

