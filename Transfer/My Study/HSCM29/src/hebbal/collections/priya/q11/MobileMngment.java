package hebbal.collections.priya.q11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MobileMngment {

	public static void main(String[] args)
	{
		
		List<Mobile> l= new ArrayList<Mobile>();
		
		l.add(new Mobile("OnePlus", 20000, "black"));
		l.add(new Mobile("Samsung", 20000, "blue"));
		l.add(new Mobile("Redmi", 20000, "red"));
		l.add(new Mobile("Nokia", 20000, "white"));
		l.add(new Mobile("Apple", 18000, "white"));
		
		
		Collections.sort(l, new Mobile());
		
		Iterator<Mobile> itr1= l.iterator();
		
		while(itr1.hasNext())
		{
			Mobile m=itr1.next();
			
			System.out.println(m);
		}
		
		
		
		
	}

}
