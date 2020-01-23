class SingleInheritence
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Begins");
		A a = new A();
		B b = new B();
		C c = new C();

		//Accessing Members of Class A
		System.out.println("Accessing Members of Class A");
		System.out.println("A.x " + a.x);
		System.out.println("A.y " + a.y);
		a.m1();

		
		//Accessing Members of Class B
		System.out.println("\n\nAccessing Members of Class B");
		System.out.println("B.p " + b.p);
		System.out.println("B.q " + b.q);
		b.m2();
		//Accessing Members of Class B ---Inherited from class A---
		System.out.println("***Accessing Members of Class B ---Inherited from class A---");
		System.out.println("B.x " + b.x);
		System.out.println("B.y " + b.y);
		b.m1();


		//Accessing Members of Class C
		c.m2(1000,2000);
		//Accessing Members of Class C ---Inherited from class A---
		System.out.println("***Accessing Members of Class B ---Inherited from class A---");
		System.out.println("C.x " + c.x);
		System.out.println("C.y " + c.y);
		c.m1();
	}
}


class  A
{
	int x= 10;
	double y= 10.11;

	public void m1()
	{
		System.out.println("In m1 Method of class A");
	}
}

class  B extends A
{
	int p= 20;
	double q= 20.22;

	public void m2()
	{
		System.out.println("In m2 Method of class B");
	}
}

class  C extends A
{

	public static void m2( int arg1, int arg2)
	{
		System.out.println("In m2 Method (accepts int, int) of class C and value of sum of agrumets is: " + (arg1 + arg2));
	}
}	