package hebbal.interfaces.demo;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
		t.m1(50);
		
		System.out.println("Accessing x from Itr1: "+ Itr1.x);
		System.out.println("Accessing x from Itr2: "+ Itr2.x);
		System.out.println("Accessing y from Itr2: "+ Itr2.y);		
		
		System.out.println("Accessing y from t object: "+ Test.y);
		
	}
	
	
}
