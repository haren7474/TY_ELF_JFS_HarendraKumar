package hebbal.multithreading.trafficsignal;


public class ThreadSync extends Thread
{
	private Action w;
	private String msg;
	
	public ThreadSync(Action w, String msg) 
	{
		this.w = w;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		w.actionMessage(msg);
	}
}
