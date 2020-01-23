package hebbal.multithreading.CustomThread;

public class MainClass 
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		
		//Born Thread
		MyThread1 t1= new MyThread1();
		MyThread1 t2= new MyThread1();
		MyThread1 t3= new MyThread1();
		
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t3.setName("Thread-C");
		
		t1.start();
		t2.start();
		t3.start();
		//t1.run();
		//t2.run();
		//t3.run();
		
		for (int i = 101; i <= 110; i++) 
		{
			System.out.println("Current Thread : " +  Thread.currentThread().getName());
			System.out.println("i: = "+i);
		}
		
		System.out.println("Main Method Ended");
	}
}
