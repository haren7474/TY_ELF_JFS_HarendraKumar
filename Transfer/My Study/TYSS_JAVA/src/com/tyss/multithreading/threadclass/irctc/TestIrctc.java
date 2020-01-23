package com.tyss.multithreading.threadclass.irctc;

public class TestIrctc {

	public static void main(String[] args)
	{
		System.out.println("MMS");
		Irctc i= new Irctc();
		User u1= new User(i);
		u1.start();
		
		
		User u2= new User(i);
		u2.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		
		i.leaveMe();
		System.out.println("MME");
	}

}
