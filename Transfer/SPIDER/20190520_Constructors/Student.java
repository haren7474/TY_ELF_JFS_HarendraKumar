class  StudentDetail
{
	public static void main(String[] args) 
	{
		Student std1= new Student("Harry" , 101, 86.1);
		Student std2= new Student("Sakshi", 102, 16.0);
		Student std3= new Student("Shreya" , 103, 96.8);

		System.out.println("Name in std1: " + std1.sName);
		System.out.println("Name in std1: " + std1.sId);
		System.out.println("Name in std1: " + std1.sMarks);

		System.out.println("\nName in std2: " + std2.sName);
		System.out.println("Name in std2: " + std2.sId);
		System.out.println("Name in std2: " + std2.sMarks);

		
		System.out.println("\nName in std3: " + std3.sName);
		System.out.println("Name in std3: " + std3.sId);
		System.out.println("Name in std3: " + std3.sMarks);
	}
}	

class Student
{
	String sName;
	int sId;
	double sMarks;

	Student(String name, int id, double marks)
	{
		sName= name;
		sId= id;
		sMarks= marks;
	}
}