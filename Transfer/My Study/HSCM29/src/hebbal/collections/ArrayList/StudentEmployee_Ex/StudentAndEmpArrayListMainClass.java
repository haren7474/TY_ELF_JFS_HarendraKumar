package hebbal.collections.ArrayList.StudentEmployee_Ex;

import java.util.ArrayList;
import java.util.List;

public class StudentAndEmpArrayListMainClass 
{
	public static void main(String[] args) 
	{
		List l= new ArrayList();
		
		l.add(new Student("Harendra", 1, 10.11));
		l.add(new Student("Mahendra", 2, 20.11));
		l.add(new Student("Surendra", 3, 70.11));
		l.add(new Student("Degjhgjggjjv", 4, 40.11));
		l.add(new Student("Sakkgjhshi", 5, 50.11));
		l.add(new Student("Aishwarya", 6, 50.11));
		
		l.add(new Employee("Harendra", 55000, 55));
		l.add(new Employee("Mahendra", 2, 56000));
		l.add(new Employee("Surendra", 3, 302500));
		l.add(new Employee("Dkhgjkjkgev", 4, 405200));
		l.add(new Employee("Sakgkshi", 5, 504840));
		l.add(new Employee("Aishwarya", 6, 505100));

		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("----------------------------------------");
		
		System.out.println("------Print All------------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			System.out.println(obj);
		}
		
		System.out.println("------Only Student Objects-----------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			
			if(obj instanceof Student)
			{
			System.out.println(obj);
			}
		}
		
		
		System.out.println("------Only Student Whose name starts with S-----------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			
			if(obj instanceof Student)
			{
				Student s= (Student) obj;
				
				if(s.getName().startsWith("S"))
				{
					System.out.println(s);
				}
			}
		}
		
		
		System.out.println("------Only Student Whose Marks >60-----------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			
			if(obj instanceof Student)
			{
				Student s= (Student) obj;
				
				if(s.getMarks()>60)
				{
					System.out.println(s);
				}
			}
		}
		
		
		System.out.println("------Only Student Whose Ends with i and Marks <60-----------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			
			if(obj instanceof Student)
			{
				Student s= (Student) obj;
				
				if(s.getMarks()<60 && s.getName().endsWith("i"))
				{
					System.out.println(s);
				}
			}
		}
		
		
		System.out.println("------Only Employees Whose Salary between 50k and 60k-----------");
		for(int i=0; i<l.size();i++)
		{
			Object obj= l.get(i);
			
			if(obj instanceof Employee)
			{
				Employee e= (Employee) obj;
				
				if(e.getSal()>50000 && e.getSal()<60000)
				{
					System.out.println(e);
				}
			}
		}
		
	}
}
