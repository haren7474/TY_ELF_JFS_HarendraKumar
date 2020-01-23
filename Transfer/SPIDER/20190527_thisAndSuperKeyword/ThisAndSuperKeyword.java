class ThisAndSuperKeyword 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


class Parent
{
	int x=10;
	double y= 10.11;

	public void print()
	{
		System.out.println("Print Method inside Super Class");
	}
}


class Child extends Parent
{
	int x= 20;
	double y = 20.11;

	public void disp()
	{
		System.out.println(x+ this.x + super.x);
		System.out.println(x+ this.x + super.x);
	}
}