package hebbal.inheritence.example;

import gmail.login.Test;

class Demo 
{
	private int x= 1;
	protected int y= 2;
	int z=3;
	public int a=4;
	
	public int getX()
	{
		return x;
	}
	public void m1()
	{
		System.out.println("Inside public m1()");
	}
	
	void m2()
	{
		System.out.println("Default public m2()");
	}
	
	private void m3()
	{
		System.out.println("Inside private m3()");
	}
	
	protected void m4()
	{
		m3();
		System.out.println("Inside protected m4()");
	}

}


class Display extends Demo
{
	void m5()
	{
		System.out.println("Inside void m5()");
	}
}

class AccModiTest extends Test 
{
	public void accModifierTest() 
	{
		// Accessing Outside the package from gmail.login.Test

		Test t = new Test();

		System.out.println(t.getPri(201));
		System.out.println(t.getDef(200));
		System.out.println(pro);
		System.out.println(pub);
		t.sum();
	}

}

class SuperClass
{
	int p=6;
	double q=7.1;
	
}

class SubClass extends SuperClass
{
	int p;
	double q;
	
	SubClass(int p, double q)
	{
		//super(501,502.11);
		this.p=p;
		this.q=q;
	}
	
	public void thisAndSuper()
	{	
	int p=50;
	double q=51.1;
	
	System.out.println("local p= "+ p);
	System.out.println("local q= "+ q);
	
	System.out.println("Instance p= "+ this.p);
	System.out.println("Instance q= "+ this.q);	
	

	System.out.println("Super p= "+ super.p);
	System.out.println("Super q= "+ super.q);	
	
	}	
}


public class MainClass
{	
	public static void main(String[] args) 
	{
		Display disp = new Display();
		System.out.println(disp.a);
		System.out.println(disp.getX());
		System.out.println(disp.y);
		System.out.println(disp.z);
		disp.m1();
		disp.m2();
		//disp.m3(); Private Method can't be accessed
		disp.m4();
		disp.m5();
		
		AccModiTest amt= new AccModiTest();
		amt.accModifierTest();

		SubClass sc= new SubClass(101,102.11);
		sc.thisAndSuper();
		
	}
}