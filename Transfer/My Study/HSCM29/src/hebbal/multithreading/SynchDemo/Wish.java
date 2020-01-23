package hebbal.multithreading.SynchDemo;


public class Wish extends Thread
{
	 public void wishMsg(String msg)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello :" + msg);
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
