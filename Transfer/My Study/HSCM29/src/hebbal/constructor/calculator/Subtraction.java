package hebbal.constructor.calculator;

public class Subtraction extends Calculator
{
	Subtraction (int x, int y)
	{
		super(x,y);
	}
	
	public void calculation()
	{
		System.out.println("Difference is: "+ (x-y));
	}

}
