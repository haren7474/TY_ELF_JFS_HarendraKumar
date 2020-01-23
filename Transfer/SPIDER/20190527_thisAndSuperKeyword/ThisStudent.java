class ThisStudent
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Student s1= new Student("Sakshi", 12, 95.1);
		Student s2= new Student("Shreya", 13, 98.1);
		Student s3= new Student("Harry", 14, 91.1);
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();

	}
}

class Student
{
	String name;
	int id;
	double marks;

	Student(String name, int id, double marks)
	{
		this.name= name;
		this.id=id;
		this.marks= marks;
	}

	public void getDetails()
	{
		String name= "Harendra";
		int id=01;
		double marks= 11.11;

		System.out.println("\nLocal Name: "+ name);
		System.out.println("Local Id: "+ id);
		System.out.println("Local Marks: "+ marks);


		System.out.println("\nCurrent Name: "+ this.name);
		System.out.println("Current Id: "+ this.id);
		System.out.println("Current Marks: "+ this.marks);


	}
}