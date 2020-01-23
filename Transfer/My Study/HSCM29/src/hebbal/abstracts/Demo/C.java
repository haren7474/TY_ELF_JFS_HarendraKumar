package hebbal.abstracts.Demo;

public class C extends B
{
	char c= 'A';
	
	public void m1()
	{
		System.out.println("m1 defined in class C");
	}
	
	public void m1(int arg)
	{
		System.out.println("argumented m1 defined in class C " + arg);
	}
	
	public void m2()
	{
		System.out.println("m2 defined in class C");
	}
	
	public void m2(double arg1)
	{
		System.out.println("Argumented m2 defined in class C "+ arg1);
	}
}
