package hebbal.javaGrooming.collection.mobileSorting;

import java.util.ArrayList;
import java.util.Collections;

public class MobileArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Mobile> l= new ArrayList<>();
		l.add(new Mobile("Samsung", 15000, "Black"));
		l.add(new Mobile("Nokia", 10000, "Red"));
		l.add(new Mobile("LG", 12000, "Black"));
		l.add(new Mobile("OnePlus", 35000, "Blue"));
		l.add(new Mobile("OnePlus", 24000, "Pink"));
		l.add(new Mobile("Vivo", 30000, "Gray"));
	
		
		System.out.println("----List of all Mobile-------");
		for (Mobile m : l) 
		{
			System.out.println(m);
		}
		
		System.out.println("\n----List of all Mobile sorted in given range-------");
		Collections.sort(l);
	
	
		for (Mobile m : l) 
		{
			if(m.getPrice()>10000 && m.getPrice()< 20000)
			System.out.println(m);
		}
	}
}
