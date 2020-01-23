package hebbal.collections.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_Integer_Sorting 
{
	public static void main(String[] args) 
	{
		Set<Integer> s= new HashSet<Integer>();
		
		s.add(12);
		s.add(78);
		s.add(12);
		s.add(1);
		s.add(0);
		s.add(-12);
		//System.out.println(s.add(null));
		//System.out.println(s.add(null));
		System.out.println(s);
		
		
		//Sort Method is present only in List hence we will convert this hashset to arraylist to use sort method.
		List<Integer> l = new ArrayList<Integer> (s);		
		Collections.sort(l);
		System.out.println("After Sort "+ l);
		
		
		
		Set<String> p= new HashSet<String>();
		
		//p.add(null);
		p.add("Haren");
		p.add("Haren");
		p.add("Hello");
		p.add("Zen");
		p.add("Dinga");
	
		
		System.out.println("String Before Sort "+ p);
		List<String> ls = new ArrayList<String> (p);
		Collections.sort(ls);
		
		System.out.println("String After Sort "+ ls);
	}
}
