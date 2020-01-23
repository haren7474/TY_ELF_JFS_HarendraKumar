package hebbal.multithreading.CustomThread;

public class MyThread1 extends Thread
{
	@Override
	synchronized public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Current Thread: "+ Thread.currentThread().getName());
			System.out.println("i: "+ i);
		}
		
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
