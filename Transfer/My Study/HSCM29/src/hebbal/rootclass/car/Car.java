package hebbal.rootclass.car;

public class Car 
{
	String name;
	String color;
	double price;
	
	public Car(String name, String color, double price) 
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+ this.name+ " Color "+ this.color+" Price "+ this.price;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Car c= (Car) obj;
		
		return this.name.equals(c.name) &&
				this.color.equals(c.color) &&
				this.price== c.price;
	}
}
