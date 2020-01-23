package hebbal.constructor.calculator;

public class Division extends Calculator
{
	Division (int x, int y)
	{
		super(x,y);
	}
	public void calculation()
	{
		System.out.println("Division is: "+ (x/y));
	}

}
