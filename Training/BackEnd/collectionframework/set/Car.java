package com.tyss.collectionframework.set;

public class Car implements Comparable<Car>
{
	String brand;
	double price;
	
	public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car c) 
	{
		if(this.price > c.price)
		{
			return 1;
		}
		else if(this.price < c.price)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
	
	
	
}
