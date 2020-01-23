package hebbal.collections.TreeSet.CarSorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Car_Sorting 
{
	public static void main(String[] args) 
	{

		Set<Car> s = new TreeSet<Car>();

		s.add(new Car("Audi", "Red", 15000));
		s.add(new Car("RR", "Gray", 6000));
		s.add(new Car("McF1", "White", 45000));
		s.add(new Car("Bugati", "Pink", 78000));

		Iterator<Car> itr = s.iterator();

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
