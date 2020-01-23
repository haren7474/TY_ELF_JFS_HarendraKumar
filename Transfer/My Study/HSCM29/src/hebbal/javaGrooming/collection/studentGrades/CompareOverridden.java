package hebbal.javaGrooming.collection.studentGrades;

public class CompareOverridden extends Student implements Comparable<Student>
{
	

	public CompareOverridden(String name, int id, double marks, String stream) 
	{
		super(name, id, marks, stream);	
	}
	

	

	@Override
	public int compareTo(Student s)
	{
		int temp=0;
		Integer choice = null;
		Double m1= s.getMarks();
		Double m2= this.getMarks();
		
		if(choice==1)
		{
			temp= s.getStream().compareTo(this.getStream());
		}
		else if(choice==2)
		{
			temp= m1.compareTo(m2);
		}
		return temp;
	}
}
