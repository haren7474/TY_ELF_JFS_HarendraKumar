package hebbal.multithreading;

public class ThreadWithRunnable 
{
	public static void main(String[] args) 
	{
		MyThread mt= new MyThread();
		
		//mt.start(); //It Gives error as we are not extending from Thread class. Runnable Interface does not contains start()
		
		Thread t= new Thread();
		//t.start(); //It will call Thread class run method not MyThread
		
		Thread t1= new Thread(mt);
		t1.start();//It will use proper run method.
	}
}

class MyThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
