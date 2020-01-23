package hebbal.collections.TreeSet.MobileSorting;

import java.util.Comparator;

public class Mobile implements Comparable<Mobile>, Comparator<Mobile>
{
	private String name;
	private int id;
	private double price;
	
	public Mobile(String name, int id, double price) 
	{
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public Mobile()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return getName() + "\t\t" + getId() + "\t\t" + getPrice();
	}
	
	//For Default sorting
	@Override
	public int compareTo(Mobile s)
	{
		/*
		//Based on Id
		Integer i1= this.id;
		Integer i2= s.getId();
		
		return i1.compareTo(i2);*/
		
		/*
		//Based on Name
		String s1= this.name;
		String s2= s.getName();
		
		return s1.compareTo(s2);*/
		
		//Based on Marks
		Double d1= this.getPrice();
		Double d2= s.getPrice();
		
		return d1.compareTo(d2);
	}
	
	//Descending
	public int compare(Mobile m1, Mobile m2)
	{
		// Based on id
		Integer i1 = m1.getId();
		Integer i2= m2.getId();
		
		return i2.compareTo(i1);
	}
	
}
