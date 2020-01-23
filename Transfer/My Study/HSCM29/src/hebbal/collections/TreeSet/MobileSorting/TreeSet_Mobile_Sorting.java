package hebbal.collections.TreeSet.MobileSorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Mobile_Sorting 
{
	public static void main(String[] args) 
	{

		Set<Mobile> s = new TreeSet<Mobile>(new Mobile());

		s.add(new Mobile("Samsung", 1, 15000));
		s.add(new Mobile("Apple", 2, 6000));
		s.add(new Mobile("OnePlus", 3, 45000));
		s.add(new Mobile("IphoneX", 4, 78000));

		Iterator<Mobile> itr = s.iterator();

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
