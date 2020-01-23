package hebbal.collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_String_StartsWith {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Hello");
		s.add("Salim");
		s.add("Sajal");
		s.add("Swati");
		s.add("Harendra");
		s.add("Sakshi");
		s.add("Aisha");

		System.out.println("Originol HashSet\n"+ s);

		Iterator<String> itr = s.iterator();

		System.out.println("\nPrinting the String which are starting with 'Sa'");
		while (itr.hasNext()) 
		{
			String name= itr.next();
			
			if(name.startsWith("Sa"))
			System.out.println(name);
		}
	}
}
