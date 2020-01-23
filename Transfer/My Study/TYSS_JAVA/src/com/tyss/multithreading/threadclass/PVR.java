package com.tyss.multithreading.threadclass;

public class PVR 
{
	synchronized void confirmTicket()
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println(i);
			try {
				//Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	synchronized void leaveMe()
	{
		System.out.println("Calling Notify");
		notify();
	}
}
