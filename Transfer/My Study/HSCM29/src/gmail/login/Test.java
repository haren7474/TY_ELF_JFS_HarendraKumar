package gmail.login;

public class Test
{
	private int pri = 10;
	int def = 20;
	protected int pro = 50;
	public int pub = 40;


	public int getPri(int pri) 
	{
		return pri;
	}

	public int getDef(int def) 
	{
		return def;
	}

	public void sum() 
	{
		int pri = 1;
		int def = 2;
		int pro = 3;
		int pub = 5;
		System.out.println("Local Sum is: " + (pri + def + pro + pub));
		System.out.println("Instance Variable Sum is: " + (this.pri + this.def + this.pro + this.pub));
	}
}
