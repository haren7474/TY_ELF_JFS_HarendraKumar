package hebbal.javaGrooming.collection.studentGrades;

import java.util.ArrayList;

public class DeleteStudents {

	public static void deleteStudent(ArrayList<Student> l) 
	{
		int count=0;
		for (int i = 0; i < l.size(); i++) 
		{
			Student s = (Student) l.get(i);
			if(s.getMarks()< (double) 30)
			{
			l.remove(s);
			count++;
			}
		}
		
		System.out.println("You have removed "+ count + " students");
		
		System.out.println("\nUpdated List");
		for (Student student : l) {
			System.out.println(student);
		}
	}
}
