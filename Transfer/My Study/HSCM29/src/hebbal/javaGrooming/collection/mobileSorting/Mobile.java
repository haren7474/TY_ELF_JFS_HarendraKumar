package hebbal.javaGrooming.collection.mobileSorting;

public class Mobile implements Comparable<Mobile>
{
	private String brand;
	private double price;
	private String color;
	
	public Mobile(String brand, double price, String color)
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return getBrand() + "\t\t" + getPrice() + "\t\t" + getColor();
	}
	
	public int compareTo(Mobile m)
	{
		return (int) (this.getPrice()- m.getPrice());
	}
	
}
