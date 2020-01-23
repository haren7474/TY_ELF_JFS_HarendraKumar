package edu.jspiders.j2ee.adminemployeemodule;

public class EmployeeDetails
{
	private int id;
	private String name;
	private String location;
	private double ctc;
	private int emptype;
	
	public EmployeeDetails(int id, String name, String location, double ctc, int emptype) 
	{
		this.id = id;
		this.name = name;
		this.location = location;
		this.ctc = ctc;
		this.emptype = emptype;
	}

	public EmployeeDetails(int id, String newValue, String column) 
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public int getEmptype() {
		return emptype;
	}

	public void setEmptype(int emptype) {
		this.emptype = emptype;
	}
	
	
}
