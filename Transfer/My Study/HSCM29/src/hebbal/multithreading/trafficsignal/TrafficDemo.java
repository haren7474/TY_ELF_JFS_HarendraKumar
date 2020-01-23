package hebbal.multithreading.trafficsignal;

public class TrafficDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Method Started");

		Action w = new Action();
		ThreadSync t1 = new ThreadSync(w, "East");
		ThreadSync t2 = new ThreadSync(w, "West");
		ThreadSync t3 = new ThreadSync(w, "North");
		ThreadSync t4 = new ThreadSync(w, "South");

		t1.setName("East Go");
		t2.setName("West Go");
		t3.setName("North Go");
		t4.setName("South Go");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t4.join();

		for (int i = 11; i <= 13; i++) {
			System.out.println("Current Thread : " + Thread.currentThread().getName());
			System.out.println("J: = " + i);
		}

		System.out.println("Main Method Ended");
	}
}
