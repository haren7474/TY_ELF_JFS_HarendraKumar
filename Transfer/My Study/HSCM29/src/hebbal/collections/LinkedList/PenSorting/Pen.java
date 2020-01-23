package hebbal.collections.LinkedList.PenSorting;

import java.util.Comparator;

public class Pen implements Comparator<Pen> {
	private String brand;
	private double price;
	private String color;

	public Pen(String brand, double price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public Pen()
	{
		
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

	@Override
	public int compare(Pen p1, Pen p2) {
		Double d1 = p1.getPrice();
		Double d2 = p2.getPrice();

		return d2.compareTo(d1);
	}
}
