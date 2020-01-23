package hebbal.multithreading.join;

public class MainWaitingForMain {

	public static void main(String[] args) throws InterruptedException 
	{
	System.out.println("Main Method Started");
	Thread.currentThread().join();
	System.out.println("Main Method Ended");
	}
}

