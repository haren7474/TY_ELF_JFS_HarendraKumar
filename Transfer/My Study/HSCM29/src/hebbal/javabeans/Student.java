package hebbal.javabeans;

public class Student 
{
	private String name;
	private int id;
	private double marks;
	
	public Student(String name, int id, double marks)
	{
		this.name= name;
		this.id = id;
		this.marks= marks;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getMarks()
	{
		return marks;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	
	
}
