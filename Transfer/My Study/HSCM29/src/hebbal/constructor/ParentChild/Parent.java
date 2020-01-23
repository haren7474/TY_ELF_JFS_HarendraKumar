package hebbal.constructor.ParentChild;

public class Parent 
{
	int x;
	double y;
	
	Parent(int x, double y)
	{
		this();
		this.x=x;
		this.y=y;
		System.out.println("Int/ double agrument in Parent "+ x + "    "+ y);
	}
	
	Parent()
	{
		int x=501;
		double y  = 501.11;
		System.out.println("No Argument contructor in Parent"+ x+"  "+ y);
	}
	
	public void m1()
	{
		int x=1;
		double y=1.11;
	
		System.out.println("\n\nm1 method local "+ x+ "  "+ y);
		System.out.println("m1 method This "+ this.x+ "  "+ this.y);
	}
}
