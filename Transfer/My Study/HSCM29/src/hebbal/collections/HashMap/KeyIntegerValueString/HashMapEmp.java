package hebbal.collections.HashMap.KeyIntegerValueString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEmp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<String, String> m= new HashMap<String, String>(); 
		m.put("Haren", "Delhi");
		m.put("Priya", "Bangalore");
		m.put("Sakshi", "GZB");
		m.put("Saurav", "Patna");
		m.put("Aisha", "Mangalore");
	
		System.out.println("Please enter emp name");
		String ename= sc.next();
		
		Set<Entry<String, String>> s= m.entrySet();
		Iterator<Entry<String, String>> itr= s.iterator();
		
		while(itr.hasNext())
		{
			Entry<String, String> e=itr.next();
			
			if(e.getKey().equalsIgnoreCase(ename))
			{
			System.out.println(e.getKey()+ "\t\t" + e.getValue());
			}
		}
		
	}
}
