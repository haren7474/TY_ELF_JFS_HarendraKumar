class PrivateCantBeAccessed 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Starts");
		B b = new B();
		//System.out.println(b.x); /////Private members can't be accesses
		System.out.println(b.y);
		System.out.println(b.z);
		System.out.println(b.m);
		System.out.println(B.n);
		b.m1();
		//b.m2();
		B.m3();
	}
}


class A
{
	private int x= 10;
	int y=20;
	protected int z= 30;
	public int m= 40;
	public static double n= 10.11;

	public void m1()
	{
		System.out.println("m1 Present in class A");
	}

	private void m2()
	{
		System.out.println("m2 Present in class A");
	}

	public static void m3()
	{
		System.out.println("m3 Present in class A");
	}
}


class B extends A
{
}


