package hebbal.javabeans;

public class Car 
{
	private String brand;
	private int price;
	private String color;
	private String classtype;
	
	public Car(String brand, int price, String color, String classtype) 
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.classtype = classtype;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getClassType()
	{
		return classtype;
	}
	
	public void setBrand(String brand)
	{
		this.brand= brand;
	}
	
	public void setPrice(int price)
	{
		this.price= price;
	}
	
	public void setColor(String color)
	{
		this.color= color;
	}
	
	public void setClassType(String classtype)
	{
		this.classtype= classtype;
	}
	
}
