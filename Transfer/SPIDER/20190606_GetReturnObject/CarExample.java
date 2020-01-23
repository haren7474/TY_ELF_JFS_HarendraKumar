class CarExample 
{
	public static void main(String[] args) 
	{
		System.out.println("MMS");

		new ShowRoom().printDetails(new Car("BMW", "Red", 400000));
		new ShowRoom().printDetails(new Car("Audi", "White", 750000));
		new ShowRoom().printDetails(new Car("Merc", "Red", 950000));
		new ShowRoom().printDetails(new Car("RR", "Gray", 9900000));
	}
}

class Car
{
	String name;
	String color;
	double price;

	Car(String name, String color, double price)
	{
		this.name = name;
		this.color= color;
		this.price= price;
	}
}


class ShowRoom
{
	public void printDetails(Car c)
	{
		System.out.println("Name: =" + c.name);
		System.out.println("Color: =" + c.color);
		System.out.println("Price: =" + c.price + "\n");
	}
}
