class ThisSum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t= new Test(10,10.11);
		t.display();
	}
}

class Test
{
	int x;
	double y;

	Test(int x, double y)
	{
		this.x= x;
		this.y=y;
	}

	public void display()
	{
		int x=20;
		double y=30.11;

		System.out.println("x+ this x "+ (this.x + x));
		System.out.println("y+ this x "+ (this.y + y));
	}
}