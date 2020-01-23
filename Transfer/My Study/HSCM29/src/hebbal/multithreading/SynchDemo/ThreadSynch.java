package hebbal.multithreading.SynchDemo;

public class ThreadSynch extends Thread
{
	private Wish w;
	private String msg;
	
	public ThreadSynch(Wish w, String msg) 
	{
		this.w = w;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		w.wishMsg(msg);
	}
	
	
}
