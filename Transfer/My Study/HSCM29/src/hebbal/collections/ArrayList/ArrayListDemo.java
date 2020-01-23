package hebbal.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		Collection coll1= new ArrayList();
		Collection coll2= new ArrayList();
		
		coll1.add(43);
		coll1.add('A');
		coll1.add("Hello");
		coll1.add(null);
		coll1.add(43);
		coll1.add(12f);
		coll1.add("Hello");
		coll1.add(1.23);
		coll1.add(null);
		coll1.add(1.23);
		coll1.add("Harendra");
		
		System.out.println(coll1); //[43, A, Hello, null, 43, 12.0, Hello, 1.23, null, 1.23, Harendra]
		System.out.println(coll2); //[]
		coll1.remove(43); // Only removes 1st Object
		System.out.println(coll1); //[A, Hello, null, 43, 12.0, Hello, 1.23, null, 1.23, Harendra]
		
		coll2.add("Haren");
		coll2.add("India");
		coll2.add(12);		
		coll2.add(43);
		coll2.add(43);
		coll2.add(43);
		coll2.add(43);
		
		System.out.println(coll2); //[Haren, India, 12, 43, 43, 43, 43]
		
		List l= (List) coll1;
		l.add(3,"Do Shifting");
		System.out.println(coll1); //[A, Hello, null, Do Shifting, 43, 12.0, Hello, 1.23, null, 1.23, Harendra]
		//l.remove(43);// It will give run time error as 43 is treated as index while in line 28 i.e. coll1.remove(43) will not give error because it is object there
		System.out.println(l); //[A, Hello, null, Do Shifting, 43, 12.0, Hello, 1.23, null, 1.23, Harendra]
		System.out.println(l.remove(5));// 12
		System.out.println(l); //[A, Hello, null, Do Shifting, 43, Hello, 1.23, null, 1.23, Harendra]

	}

}
