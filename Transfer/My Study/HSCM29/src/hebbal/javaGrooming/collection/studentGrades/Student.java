package hebbal.javaGrooming.collection.studentGrades;

public class Student implements Comparable<Student>
{

	private String name;
	private int id;
	private double marks;
	private String stream;
	

	public Student(String name, int id, double marks, String stream) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.stream = stream;
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


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	@Override
	public String toString() 
	{
		return getId() + "\t\t" + getName() + "\t\t" + getMarks() + "\t\t" + getStream();
	}

	@Override
	public int compareTo(Student s)
	{
		int temp=0;
		int choice= SortStudent.choice;
		Double m2= s.getMarks();
		Double m1= this.getMarks();
		
		if(choice==1)
		{
			temp= this.getStream().compareTo(s.getStream());
		}
		else if(choice==2)
		{
			temp= m1.compareTo(m2);
		}
		return temp;
	}
}
