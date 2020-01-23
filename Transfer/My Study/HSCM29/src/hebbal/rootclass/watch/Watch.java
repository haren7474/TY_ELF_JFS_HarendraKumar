package hebbal.rootclass.watch;


public class Watch 
{
	private int hour;
	private int min;
	private int sec;
	
	public Watch(int hour, int min, int sec) 
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Watch w= (Watch) obj;
		
		return this.hour== w.hour &&
				this.min== w.min &&
				this.sec== w.sec;
		
	}
	
	@Override
	public String toString()
	{
		return "Name: "+ this.hour+ " Color "+ this.min+" Price "+ this.sec;
	}

}
