package hebbal.multithreading.SynchDemo;

public class SynchDemo 
{
	public static void main(String[] args)
	{
		Wish w1= new Wish();
		Wish w2= new Wish();
		Wish w3= new Wish();
		Wish w4= new Wish();
		
		ThreadSynch t1= new ThreadSynch(w1, "Dhoni");
		ThreadSynch t2= new ThreadSynch(w1, "Kohli");
		ThreadSynch t3= new ThreadSynch(w1, "Rohit");
		ThreadSynch t4= new ThreadSynch(w1, "ABD");
		
		t1.setName("Dhoni Thread ");
		t2.setName("Kohli Thread ");
		t3.setName("Rohit Thread ");
		t4.setName("ABD Thread ");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
