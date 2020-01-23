package hebbal.multithreading.yield;

public class MainThread 
{

	public static void main(String[] args) 
	{
		MyThread t= new MyThread();
		t.start();
		
		for(int i=1;i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=10000;i++)
		{
			System.out.println("Child Thread");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}