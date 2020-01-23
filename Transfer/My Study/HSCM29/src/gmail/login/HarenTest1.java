package gmail.login;

public class HarenTest1 
{
	private int a=10;
	int b=20;
	static protected int c=30;
	public static int d=40;
	
	private static void m1()
	{		
		System.out.println("private m1 in HarenTest1, being printed through m2");
	}
	
	static void m2()
	{	
		System.out.println("default m2 starts in HarenTest1");
		m1();
		System.out.println("default m2 ends in HarenTest1");
	}
	
	protected static void m3()
	{	
		System.out.println("protected m3 starts in HarenTest1");
		m2();
		System.out.println("protected m3 ends in HarenTest1");
	}
	
	public static void m4()
	{		
		System.out.println("Public m4 in HarenTest1");
	}
	
	public int getA()
	{
		return a;
	}
}
