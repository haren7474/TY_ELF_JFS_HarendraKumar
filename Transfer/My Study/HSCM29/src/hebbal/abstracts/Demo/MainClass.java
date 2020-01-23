package hebbal.abstracts.Demo;

public class MainClass 
{
	public static void main(String [] args)
	{
	C c = new C();
	
	c.m1();
	c.m1(10);
	c.m2();
	c.m2(10.11);

	
	System.out.println("x= " + c.x);
	System.out.println("y= " + c.y);
	System.out.println("c= " + c.c);
	
	
	}
}
