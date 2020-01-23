package hebbal.collections.MiniProjects.SMS;

public class Student
{
	private String name;
	private int id;
	private int marks;
	private String mobile;
	
	public Student(String name, int id, int marks, String mobile) 
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.mobile = mobile;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return getId() + "\t\t" + getMarks() + "\t\t" + getMobile() + "\t\t" + getName();
	}
	
	
}
