package hebbal.constructor.calculator;

public class Addition extends Calculator
{
	Addition (int x, int y)
	{
		super(x,y);
	}
	public void calculation()
	{
		System.out.println("Sum is: "+ (x+y));
	}
	
}
