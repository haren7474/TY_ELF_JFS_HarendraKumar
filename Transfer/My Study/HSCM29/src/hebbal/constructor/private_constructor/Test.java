package hebbal.constructor.private_constructor;

public class Test 
{
	private Test()
	{
		System.out.println("\n\nI am Constructor of Test Class and ");
	}
	
	public void disp()
	{
		System.out.println("Hello World");
	}
	
	public static Test getTestObject()
	{
		return new Test();
	}
}
