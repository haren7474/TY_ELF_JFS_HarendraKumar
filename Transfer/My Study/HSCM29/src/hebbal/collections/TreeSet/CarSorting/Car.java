package hebbal.collections.TreeSet.CarSorting;

public class Car implements Comparable<Car>
{
	private String name;
	private String color;
	private double price;

	public Car(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getName() + "\t\t" + getColor() + "\t\t" + getPrice();
	}

	// For Default sorting
	@Override
	public int compareTo(Car s) {
		// Based on Color
		String d1 = this.getColor();
		String d2 = s.getColor();

		return d2.compareTo(d1);
	}
	
	

}
