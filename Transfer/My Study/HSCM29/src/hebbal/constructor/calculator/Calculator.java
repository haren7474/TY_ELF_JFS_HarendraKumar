package hebbal.constructor.calculator;

abstract public class Calculator 
{
	int x,y;
	
	Calculator(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	abstract public void calculation();
}
