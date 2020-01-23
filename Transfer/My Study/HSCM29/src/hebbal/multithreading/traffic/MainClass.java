package hebbal.multithreading.traffic;

public class MainClass {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Method Started");

		for (int i = 1; i <= 1; i++) 
		{
			ThisThread e = new ThisThread();
			ThisThread w = new ThisThread();
			ThisThread n = new ThisThread();
			ThisThread s = new ThisThread();

			e.start();
			System.out.println("\nEast");
			e.join();
			
			w.start();
			System.out.println("\nWest");
			w.join();
			
			n.start();
			System.out.println("\nNorth");
			n.join();
			
			s.start();
			System.out.println("\nSouth");
			s.join();
			
			System.out.println("\nMain Method Ended");
		}
	}
}

class ThisThread extends Thread 
{
	@Override
	public void run() {
		try {
			for (int i = 5; i >= 1; i--) {
				System.out.println("Running: " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("I am Interrupted");
		}
	}
}
