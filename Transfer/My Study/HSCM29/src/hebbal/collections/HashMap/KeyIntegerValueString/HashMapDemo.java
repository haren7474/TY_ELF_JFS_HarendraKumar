package hebbal.collections.HashMap.KeyIntegerValueString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer, String> m= new HashMap<Integer, String>(); 
		Object obj1= m.put(10, "Hello");
		Object obj2= m.put(90, "Bye");
		m.put(90, "World");
		m.put(40, "Sakshi");
		m.put(78, "SKS");
		m.put(45, "Hello");
		
		System.out.println("\n"+m); //{null=World, 34=Hello, 40=Sakshi, 10=Hello, 90=Bye, 78=SKS}
		System.out.println(obj1);
		System.out.println(obj2);
		
		Object obj3=m.put(90, "World");
		System.out.println("\n"+m);// {null=World, 34=Hello, 40=Sakshi, 10=Hello, 90=World, 78=SKS}
		System.out.println(obj3);// Bye
		
		
		Object obj4=m.remove(34);
		System.out.println("\n"+m);// {null=World, 40=Sakshi, 10=Hello, 90=World, 78=SKS}
		System.out.println(obj4); //Hello
		
		
		Set<Integer> s1= m.keySet();
		System.out.println("\n"+s1); //[null, 40, 10, 90, 78]
		
		
		Collection<String> c= m.values();
		System.out.println("\n"+c); //[World, Sakshi, Hello, World, SKS]
		
		Set<Entry<Integer, String>> s2= m.entrySet();
		System.out.println("\n"+s2);// [null=World, 40=Sakshi, 10=Hello, 90=World, 78=SKS]
		
		//Printing key values one by one
		System.out.println("\n--------Printing key values one by one--------------");
		Iterator<Entry<Integer, String>> itr= s2.iterator();		
		while(itr.hasNext())
		{
			Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+ "\t\t" + e.getValue());
		}
	
		//Keys Sorting
		System.out.println("----Key Sorting---------");
		Set<Integer> keys= m.keySet();
		List<Integer> l= new ArrayList<Integer>(keys);		
		Collections.sort(l);
		System.out.println("Keys Sorted: "+ l); //[10, 40, 45, 78, 90]
		Collections.sort(l, new IntegerOverride());
		System.out.println("Keys Sorted: "+ l); //[10, 40, 45, 78, 90]
		
		//Values Sorting
		System.out.println("----Values Sorting---------");
		Collection<String> values= m.values();
		List<String> ll= new ArrayList<String>(values);
		Collections.sort(ll);
		System.out.println("Values "+ ll); //[Hello, Hello, SKS, Sakshi, World]
		
		
	}
}
