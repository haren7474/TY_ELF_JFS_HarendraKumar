package com.tyss.multithreading.threadclass.irctc;

public class Irctc 
{
	synchronized void confirmTicket()
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.println(i);
			
			try 
			{
				//Thread.sleep(500);
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	synchronized void leaveMe()
	{
		System.out.println("Notify Called");
		notifyAll();
	}
}
