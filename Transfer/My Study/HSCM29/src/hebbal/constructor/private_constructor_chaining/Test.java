package hebbal.constructor.private_constructor_chaining;

public class Test 
{
	int a,b;

	private Test(int a, int b) 
	{
		this.a = a;
		this.b = b;
		System.out.println("a and b are " +a+" "+b);
	}
	
	public Test()
	{
		this(10,20);
	}
	
}
