package hebbal.exception.examples;

public class ExceptionPropogation 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		m1();
		System.out.println("Main Method Ended");
	}
	
	public static void m1()
	{
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
	}
	
	public static void m2()
	{
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
	}
	
	public static void m3()
	{
		System.out.println("m3 started");
		m4();
		System.out.println("m3 ended");
	}
	
	public static void m4()
	{
		System.out.println("m4 started");
		try
		{
		System.out.println(10/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("m4 ended");
	}
}
