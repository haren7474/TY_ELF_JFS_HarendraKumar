package hebbal.cloning.deep.penCloning;

public class Pen implements Cloneable
{
	String brand;
	String name;
	String type;
	double price;
	Refil refil;
	
	
	
	public Pen(String brand, String name, String type, double price, Refil refil) 
	{
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.price = price;
		this.refil = refil;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Pen p= (Pen) super.clone();
		p.refil= (Refil) this.refil.clone();
		return p;
	}

	@Override
	public String toString() 
	{
		return "Pen [brand=" + brand + ", name=" + name + ", type=" + type + ", price=" + price + ", refil=" + refil
				+ "]";
	}
	
}
