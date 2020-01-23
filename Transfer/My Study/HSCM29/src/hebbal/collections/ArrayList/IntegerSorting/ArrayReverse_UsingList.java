package hebbal.collections.ArrayList.IntegerSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayReverse_UsingList 
{
	public static void main(String[] args) 
	{	
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
	
		ListIterator<Integer> itr= l.listIterator();
		
		System.out.println("Forward");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\nReverse");
		
		Collections.sort(l, new IntegerComparatorOverridden());
		System.out.println(l);
		
	}
}
