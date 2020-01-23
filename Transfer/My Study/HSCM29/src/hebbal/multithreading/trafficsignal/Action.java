package hebbal.multithreading.trafficsignal;

public class Action extends Thread
{
	synchronized public void actionMessage(String s)
	{
		System.out.println("------------------------------------");
		for (int i = 1; i <=3; i++) 
		{
			System.out.println("Message: " + s);
			System.out.println("I: "+ i);
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
