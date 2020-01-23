package hebbal.multithreading.traffic;



public class MainClassSingleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Method Started");
		
		for(int i=1; i<=3; i++)
		{
		EastThread e= new EastThread();
		WestThread w= new WestThread();
		NorthThread n= new NorthThread();
		SouthThread s= new SouthThread();
		
		e.start();
		e.join();
		w.start();
		w.join();
		n.start();
		n.join();
		s.start();
		s.join();
		}
	}
}

class EastThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 5; i >=1 ; i--) 
			{
				System.out.println("East running: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I am Interrupted");
		}
	}
}


class WestThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 5; i >=1 ; i--) 
			{
				System.out.println("West running: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I am Interrupted");
		}
	}
}


class NorthThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 5; i >=1 ; i--) 
			{
				System.out.println("North  running: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I am Interrupted");
		}
	}
}

class SouthThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 5; i >=1 ; i--) 
			{
				System.out.println("South running: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I am Interrupted");
		}
	}
}

