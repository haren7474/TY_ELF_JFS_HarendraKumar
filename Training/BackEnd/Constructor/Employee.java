package com.tyss.Constructor;

public class Employee 
{
	String empName;
	int empAge;
	double empSalary;
	
	Employee(String name, int age, double salary) 
	{
		empName = name;
		empAge = age;
		empSalary = salary;
	}
	
	void empDetails()
	{
		System.out.println("Name is "+ empName + " Age is "+ empAge + " Salary is  "+ empSalary);
	}
	
}
