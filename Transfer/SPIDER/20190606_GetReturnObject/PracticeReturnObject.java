class PracticeReturnObject 
{
	public static void main(String[] args) 
	{
		Demo d= new Demo();
		Test t= d.getObject();
		t.print();
		
		System.out.println("Calling Print by Single line ");
		new Demo().getObject().print();

	}
}

class Test
{
	public void print()
	{
		System.out.println("Hello World");
	}
}

class Demo
{
	public Test getObject()
	{
		return new Test();
	}
}