package hebbal.collections.HashSet;

public class Student 
{
	private String name;
	private int id;
	private double marks;
	
	public Student(String name, int id, double marks) 
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
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
	public String toString() 
	{
		return getName() + "\t\t" + getId() 
		+ "\t\t" + getMarks();
	}

	@Override
	public int hashCode() 
	{
		return getId();
	}

	@Override
	public boolean equals(Object obj) 
	{
		boolean b = false;
		Student s= (Student)obj;
		
		if( this.getId()==(s.getId()))
			b= true;
		else
			b= false;
		return b;
	}
}
