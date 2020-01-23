package hebbal.constructor.calculator;

public class Multiplication extends Calculator
{
	Multiplication (int x, int y)
	{
		super(x,y);
	}
	
	public void calculation()
	{
		System.out.println("Multiplication is: "+ (x*y));
	}

}
