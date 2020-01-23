package hebbal.collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEvenFromHashSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();

		s.add(12);
		s.add(78);
		s.add(13);
		s.add(1);
		s.add(0);
		s.add(27);
		s.add(87);
		s.add(88);
		
		Set<Integer> s2=s;
		System.out.println("Originol List "+ s);

		System.out.println("\n-------removing even integers---------\n");
		Iterator<Integer> itr = s.iterator();

		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				itr.remove(); // Use this
				// s.remove(i); //It will give ConcurrentModificationException
			}
		}

		System.out.println("After Removal of evens" + s);

		
		System.out.println("\n-------Printint >60 elements------------\n");
	
		itr = s2.iterator();

		while (itr.hasNext()) 
		{
			Integer i = itr.next();

			if (i > 60) {
				System.out.println(i);
			}
		}

	}
}
