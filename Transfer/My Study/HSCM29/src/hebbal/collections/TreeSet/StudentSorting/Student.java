package hebbal.collections.TreeSet.StudentSorting;

public class Student implements Comparable<Student>//, Comparator<Student> 
{
	private String name;
	private int id;
	private double marks;

	public Student(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public Student() {

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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return getName() + "\t\t" + getId() + "\t\t" + getMarks();
	}

	
	// For Default sorting
	@Override
	public int compareTo(Student s) 
	{
		// Based on Names
		String d1 = this.getName();
		String d2 = s.getName();

		return d1.compareTo(d2);
	}
	
}
