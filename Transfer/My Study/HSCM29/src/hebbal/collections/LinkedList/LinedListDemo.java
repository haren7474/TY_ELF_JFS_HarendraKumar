package hebbal.collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinedListDemo {

	public static void main(String[] args) 
	{
		List<Integer> l= new LinkedList<Integer>();
		
		l.add(10);
		l.add(30);
		l.add(15);
		l.add(19);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		for(int i=0; i<l.size();i++)
		{
			if(l.get(i)%2==0)
			{
				System.out.println(l.get(i));
			}
		}
		
		Collections.sort(l);
		System.out.println(l);
	}

}
