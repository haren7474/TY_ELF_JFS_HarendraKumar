package hebbal.collections.priya.q11;

import java.util.Comparator;

public class Mobile implements Comparable<Mobile>,Comparator<Mobile> 
{
	private String brand;
	private double price;
	private String color;
	public Mobile(String brand, double price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public Mobile()
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
		return "Mobile [getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + ", getColor()=" + getColor() + "]";
	}
	
	@Override
	public int compareTo(Mobile m)
	{
		String m1=this.getBrand();//current object
		String m2=m.getBrand();//given object
		return m1.compareTo(m2);
	}
	
	@Override
	public int compare(Mobile m1,Mobile m2)
	{
		String m3=m1.getBrand();//current object
		String m4=m2.getBrand();//given object
		return m4.compareTo(m3);
	}
	
	}
	
	
	

