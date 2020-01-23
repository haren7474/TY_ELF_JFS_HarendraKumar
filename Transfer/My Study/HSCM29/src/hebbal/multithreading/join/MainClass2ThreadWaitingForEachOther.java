package hebbal.multithreading.join;


class MyThreadd extends Thread
{
	static Thread t;
	@Override
	public void run()
	{
		
		try
		{
			t.join(); //Waiting for Parent Thread to complete
			for (int i = 1; i <=10 ; i++) 
			{
				System.out.println("I am Sleeping");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I am Interrupted");
		}
	}
}
public class MainClass2ThreadWaitingForEachOther 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Method Started");
		
		MyThreadd.t= Thread.currentThread();
		MyThreadd t= new MyThreadd();
		t.start();
		t.join(); //Waiting for Child Thread to ccomplete
		for (int i = 1; i <=10 ; i++) 
		{
			System.out.println("Parent Thread");
			Thread.sleep(3000);
		}
	
	}

}
