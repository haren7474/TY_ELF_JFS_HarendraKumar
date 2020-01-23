class CyclicInheritence extends CyclicInheritence_2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!"); //Compile Time Error Cyclic Inheritence
	}
}


class CyclicInheritence_2 extends CyclicInheritence
{
	public static void m1() 
	{
		System.out.println("Hello m1!"); // Compile Time Error Cyclic Inheritence
	}

}


class Z extends Z
{
	public static void m1() 
	{
		System.out.println("Hello m1!"); // Compile Time  Error Cyclic Inheritence
	}
}