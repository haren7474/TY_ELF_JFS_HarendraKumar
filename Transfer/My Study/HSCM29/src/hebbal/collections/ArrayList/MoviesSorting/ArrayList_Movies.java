package hebbal.collections.ArrayList.MoviesSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Movies 
{
	public static void main(String[] args) 
	{
		List<Movies> l=new ArrayList<Movies>();
		
		l.add(new Movies("DDLJ", 1990, "KJO"));
		l.add(new Movies("Border", 199, "JPDutta"));
		l.add(new Movies("SOTY", 1990, "KJO"));
		l.add(new Movies("Kabir", 2019, "Haren"));
		l.add(new Movies("Hockey", 1990, "SRK"));
		
		System.out.println("--------Ascending----------------");
		Collections.sort(l);
		ListIterator<Movies> itr= l.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		
		System.out.println("\n----------Descending-----------");
		
		Collections.sort(l, new Movies());
		ListIterator<Movies> itr1= l.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next()+" ");
		}
	}
}
