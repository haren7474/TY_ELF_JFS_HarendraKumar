package hebbal.collections.TreeSet.StudentSorting;

import java.util.Comparator;

public class ImplementsComparator implements Comparator<Student>
{
	// Descending
		public int compare(Student s1, Student s2) {
			// Based on id
			Integer i1 = s1.getId();
			Integer i2 = s2.getId();

			return i2.compareTo(i1);
		}

}
