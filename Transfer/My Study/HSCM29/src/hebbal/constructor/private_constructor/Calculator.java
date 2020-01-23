package hebbal.constructor.private_constructor;

public class Calculator 
{
	
	private Calculator(int a, int b)
	{
		System.out.println("sum = " + (a+b));
	}
	
	
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static Calculator getObject()
	{
		return new Calculator(10,10);
	}
}
