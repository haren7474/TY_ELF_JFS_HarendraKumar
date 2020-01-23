package hebbal.collections.ArrayList.Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListGeneric_Sorting_Reverse 
{
	public static void main(String[] args) 
	{
		List<Integer> l= new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(33);
		l.add(40);
		l.add(50);
		
		System.out.println(l); //[10, 20, 30, 40, 50]
		
		
		System.out.println("Only Even");
		for(int i=0; i<l.size(); i++)
		{
			Integer itr= l.get(i);
			
			if(itr%2==0)
			{
				System.out.print(itr +" ");//10 20 40 50 
			}
		}
		
		
		List<String> s= new ArrayList<String>();
		
		s.add("My");
		s.add("Name");
		s.add("Is");
		s.add("Harendra");
		s.add("Kumar");
		
		System.out.println("\n\nUsing String");
		System.out.println(s); //My, Name, Is, Harendra, Kumar
		
		System.out.println("\nWords containing en");
		for(int i=0; i<l.size(); i++)
		{
			String str= s.get(i);
			
			if(str.contains("en"))
			{
				System.out.print(str +" ");//Harendra 
			}
		}
		
		System.out.println("\n\nSorting String Objects");
		System.out.println("Before Sorting"+ s);
		
		Collections.sort(s);
		System.out.println("Ascending Sorting"+ s);
		
		Collections.reverse(s);
		System.out.println("Descending Sorting"+ s);
		
		//If we try to do sorting in ArrayList which has hetrogeneous data the we will get error.
	}
}
