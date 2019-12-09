package com.tyss.collectionframework.set;

public class Pen implements Comparable<Pen>
{
	String name;
	int age;
	double salary;
	
	public Pen(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Pen p) 
//	{
//		return this.name.compareTo(p.name);
//	}
	
	@Override
	public int compareTo(Pen p) 
	{
		if(this.age>p.age)
			return 1;
		else if(this.age< p.age)
			return -1;
		else
		{
			return this.name.compareTo(p.name);
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
}
