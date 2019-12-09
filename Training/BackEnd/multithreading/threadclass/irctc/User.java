package com.tyss.multithreading.threadclass.irctc;

public class User extends Thread
{
	Irctc i;

	public User(Irctc i) 
	{
		this.i = i;
	}
	
	@Override
	public void run()
	{
		i.confirmTicket();
	}
	
}
