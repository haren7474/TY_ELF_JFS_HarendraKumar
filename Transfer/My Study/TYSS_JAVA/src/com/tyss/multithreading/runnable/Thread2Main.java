package com.tyss.multithreading.runnable;

public class Thread2Main {

	public static void main(String[] args)
	{
		System.out.println("MMS");
		Thread2 t2= new Thread2();
		
		Thread t= new Thread(t2);
		
		t.start();
		
		System.out.println("MME");
	}

}
