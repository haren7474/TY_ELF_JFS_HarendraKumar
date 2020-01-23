package hebbal.collections.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Sorting 
{
	public static void main(String[] args) 
	{
		Set<Double> d1= new TreeSet<Double>(); //Use this for ascending
		d1.add(50.1);
		d1.add(60.0);
		d1.add(60.0);
		d1.add(98.0);
		d1.add(30.0);
		d1.add(15.0);
		d1.add(-75.0);
		d1.add(0.0);		
		System.out.println("\nBy Default: Ascending Order " + d1); //[-75.0, 0.0, 15.0, 30.0, 50.1, 60.0, 98.0]
		
		Set<Double> d2= new TreeSet<Double>(new DoubleSort()); //Use this for Descending
		d2.add(50.1);
		d2.add(60.0);
		d2.add(60.0);
		d2.add(98.0);
		d2.add(30.0);
		d2.add(15.0);
		d2.add(-75.0);
		d2.add(0.0);		
		System.out.println("\nCustomized: Descending Order " + d2); //[-75.0, 0.0, 15.0, 30.0, 50.1, 60.0, 98.0]
		
		Set<Character> c1= new TreeSet<Character>();//Use this for ascending
		c1.add('a');
		c1.add('e');
		c1.add('z');
		c1.add('i');
		c1.add('p');
		c1.add('h');
		System.out.println("\nBy Default: Ascending Order " +c1);
		
		Set<Character> c2= new TreeSet<Character>(new CharacterDesc()); //Use this for Descending
		c2.add('a');
		c2.add('e');
		c2.add('z');
		c2.add('i');
		c2.add('p');
		c2.add('h');
		System.out.println("\nCustomized: Descending Order " +c2);
		
		
		Set<String> s1= new TreeSet<String>();	//Use this for ascending
		s1.add("Hello");
		s1.add("Iello");
		s1.add("Zello");
		s1.add("Aello");
		s1.add("Pello");
		s1.add("Hello"); //Ignored
		System.out.println("\nBy Default: Ascending Order " +s1);
		
		Set<String> s2= new TreeSet<String>(new StringDesc()); //Use this for Descending
		s2.add("Hello");
		s2.add("Iello");
		s2.add("Zello");
		s2.add("Aello");
		s2.add("Cello");
		s2.add("Hello"); //Ignored
		System.out.println("\nCustomized: Descending Order " +s2);
		
		Set<StringBuffer> sbf= new TreeSet<StringBuffer>();		
		//sbf.add(new StringBuffer("Hello")); // It will give exception because StringBuffer doesnot implements Comparator(I)
		
	}

	
}
