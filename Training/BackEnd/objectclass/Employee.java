package com.tyss.objectclass;

public class Employee 
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() 
	{
		return id;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Employee e1= (Employee) obj;
		
		if(this.id== e1.id && this.name.equals(e1.name))
			return true;
		
		else
			return false;
	}
	
}
