package hebbal.collections.ArrayList.StudentEmployee_Ex;

public class Employee 
{
	private String name;
	private int sal;
	private double marks;
	
	
	public Employee(String name, int sal, double marks) 
	{
		this.name = name;
		this.sal = sal;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return getName() + "\t\t" + getSal() + "\t\t" + getMarks();
	}
	
	
	
}
