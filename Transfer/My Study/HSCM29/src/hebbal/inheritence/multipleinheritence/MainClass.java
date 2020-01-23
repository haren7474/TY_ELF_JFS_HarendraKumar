package hebbal.inheritence.multipleinheritence;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		
		int a= d.m1(1000);
		System.out.println(a);
		
		
		double b= d.m2(27);
		System.out.println(b);
		
		d.m3();
		
		System.out.println("\n\n"+Itr3.x);
		System.out.println(Itr3.y);
		System.out.println(Itr3.z);
		
		
		//Checking Sample class implementing more than 1 interfaces Itr6 and Itr7
		System.out.println("\n\nSample class implementing more than 1 interfaces Itr6 and Itr7");
		Sample s= new Sample();
		int p=s.m1(501);
		double q= s.m1(501.11);
		
		System.out.println("m1 integer values "+ p);
		System.out.println("m1 double values "+ q);
		
		System.out.println(Itr6.x);
		System.out.println(Itr7.y);
		
	}

}
