package hebbal.multithreading.CustomThread;

public class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=11; i<=20; i++)
		{
			System.out.println("Current Thread: "+ Thread.currentThread().getName());
			System.out.println("i: "+ i);
		}
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
