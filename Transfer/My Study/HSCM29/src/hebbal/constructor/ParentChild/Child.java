package hebbal.constructor.ParentChild;

public class Child extends Parent
{
	Child(int x)
	{
		super(10,20.1);
		System.out.println("Int agrument in Child "+ x);
	}
	
	Child()
	{
		this(10);
		System.out.println("No Arg in Child");
	}
	
	public void printSuperFromSub()
	{
		System.out.println("Super x and y "+ super.x+ "  "+ super.y);
	}
	
}
