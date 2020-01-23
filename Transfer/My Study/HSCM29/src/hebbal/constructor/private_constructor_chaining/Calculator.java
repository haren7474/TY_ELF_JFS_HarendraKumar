package hebbal.constructor.private_constructor_chaining;

public class Calculator 
{
	private int a,b;
	
	private Calculator(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void print()
	{
		System.out.println("Sum is = "+ (a+b));
		System.out.println("Diff is = "+ (a-b));
		System.out.println("Product is = "+ (a*b));
		System.out.println("Division is = "+ (a/b));
	}
	
	public Calculator()
	{
		this(10, 5);
	}
}
