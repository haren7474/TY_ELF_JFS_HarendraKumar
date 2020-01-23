package hebbal.collections.LinkedList.PenSorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Pen_LinkedList 
{
	public static void main(String[] args) 
	{
		List<Pen> l= new LinkedList<>();
		
		l.add(new Pen("Rotomac", 25, "Blue"));
		l.add(new Pen("Renolds", 15, "Black"));
		l.add(new Pen("Cello", 55, "Red"));
		l.add(new Pen("Gripper", 10, "Green"));
		l.add(new Pen("JimJam", 22, "Pink"));
		
		Collections.sort(l, new Pen());
		System.out.println("Sorted");
		
		Iterator<Pen> itr= l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	}
}
