package hebbal.multithreading.join;

class MyThread extends Thread {
	static Thread t;

	@Override
	public void run() {

		try {
			t.join();
			for (int i = 1; i <= 10; i++) {
				System.out.println("I am Sleeping");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("I am Interrupted");
		}
	}
}

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Method Started");

		MyThread.t = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Thread");
			Thread.sleep(3000);
		}

	}

}
