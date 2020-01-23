package hebbal.inheritence.multipleinheritence;

public class Demo implements Itr3
{
	public int m1(int arg)
	{
		System.out.println("m1() Implemented");
		return arg;
	}
	
	public double m2(int arg)
	{
		System.out.println("m2() Implemented");
		return arg/3;
	}
	
	public void m3()
	{
		System.out.println("m3() Implemented");
	}
}
