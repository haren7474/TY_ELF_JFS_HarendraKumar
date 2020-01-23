package com.tyss.multithreading.threadclass;

public class TestPVR {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		PVR p= new PVR();
		User u= new User(p);
		u.start();
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		p.leaveMe();
		System.out.println("MME");
	}
}
