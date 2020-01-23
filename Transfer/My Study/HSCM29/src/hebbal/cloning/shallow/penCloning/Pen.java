package hebbal.cloning.shallow.penCloning;

public class Pen implements Cloneable
{
	String brand;
	String name;
	String type;
	double price;
	
	public Pen(String brand, String name, String type, double price) 
	{
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.price = price;
	
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Brand= " + brand +
				"Name= " + name + 
				"type= " + type +
				"price= " + price;
	}
}
