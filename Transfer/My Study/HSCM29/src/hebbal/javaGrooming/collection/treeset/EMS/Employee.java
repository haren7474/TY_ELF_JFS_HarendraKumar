package hebbal.javaGrooming.collection.treeset.EMS;

public class Employee implements Comparable<Employee>
{
	private String empId;
	private String empName;
	private double exp;
	
	public Employee(String empId, String empName, double exp) {
		this.empId = empId;
		this.empName = empName;
		this.exp = exp;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return getEmpId() + "\t\t" + getEmpName() + "\t\t" + getExp();
	}
	
	public int compareTo(Employee e)
	{
		return this.getEmpId().compareTo(e.getEmpId());
	}
	
}
