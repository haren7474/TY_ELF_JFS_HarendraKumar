package hebbal.collections.ArrayList.StudentEmployee_Ex;

public class Car 
{
	private String brand;
	private String color;
	private int yom;
	private double price;
	
	public Car(String brand, String color, int yom, double price) 
	{
		this.brand = brand;
		this.color = color;
		this.yom = yom;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYom() {
		return yom;
	}

	public void setYom(int yom) {
		this.yom = yom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return getBrand() + "\t\t "+ getColor() + "\t\t" + getYom() + "\t\t" + getPrice() ;
	}
	
}
