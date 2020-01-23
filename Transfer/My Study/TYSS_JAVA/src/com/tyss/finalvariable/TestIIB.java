package com.tyss.finalvariable;

public class TestIIB {

	public static void main(String[] args) 
	{
		InstanceBlock ib= new InstanceBlock();
		System.out.println(ib.MAXIMUM);
		
		System.out.println("-------------------------");
		
		System.out.println("Static PI value is: "+ InstanceBlock.PI);
		System.out.println("-------------------------");
		
		InstanceBlock ib1= new InstanceBlock();
		System.out.println(ib1.MAXIMUM);
	}

}
