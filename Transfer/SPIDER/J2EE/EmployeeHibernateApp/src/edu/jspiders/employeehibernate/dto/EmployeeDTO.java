package edu.jspiders.employeehibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="employee_info")
@Entity
public class EmployeeDTO 
{
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_salary")
	private double empSalary;
	
	@Column(name="emp_department")
	private String empDepartment;
	
	public EmployeeDTO()
	{
		System.out.println("Object Created");
	}
	
	public EmployeeDTO(int empId, String empName, double empSalary, String empDepartment) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDepartment = empDepartment;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return getEmpId() + "\t\t" + getEmpName() + "\t\t" + getEmpSalary() + "\t\t" + getEmpDepartment();
	}
		
}
