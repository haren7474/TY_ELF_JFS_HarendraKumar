package hebbal.cloning.deep.penCloning;

public class Refil implements Cloneable
{
	String brand;
	double price;
	
	public Refil(String brand, double price) 
	{
		this.brand = brand;
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}

	@Override
	public String toString() 
	{
		return "Refil [brand=" + brand + ", price=" + price + "]";
	}

}
