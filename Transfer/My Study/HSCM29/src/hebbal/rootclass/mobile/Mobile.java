package hebbal.rootclass.mobile;

public class Mobile 
{
	String name;
	String color;
	double price;
	
	public Mobile(String name, String color, double price) 
	{
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+ this.name+ " Color "+ this.color+" Price "+ this.price;
	}
	
}
