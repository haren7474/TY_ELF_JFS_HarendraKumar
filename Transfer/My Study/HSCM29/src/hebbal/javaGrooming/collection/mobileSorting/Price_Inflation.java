package hebbal.javaGrooming.collection.mobileSorting;

import java.util.ArrayList;

public class Price_Inflation 
{
	public static void main(String[] args) 
	{
		ArrayList<Mobile> l= new ArrayList<>();
		l.add(new Mobile("Samsung", 4000, "Black"));
		l.add(new Mobile("Nokia", 9000, "Red"));
		l.add(new Mobile("LG", 12000, "Black"));
		l.add(new Mobile("OnePlus", 35000, "Blue"));
		l.add(new Mobile("OnePlus", 18000, "Pink"));
		l.add(new Mobile("Vivo", 32000, "Gray"));
		
		System.out.println("----List of all Mobile-------");
		for (Mobile m : l) 
		{
			System.out.println(m);
		}
		
		for (Mobile m : l) 
		{
			if(m.getPrice()>0 && m.getPrice()<= 5000)
			{
			m.setPrice(m.getPrice()*.95);
			}
			
			else if(m.getPrice()>5000 && m.getPrice()<= 10000)
			{
			m.setPrice(m.getPrice()*1.05);
			} 
			
			else if(m.getPrice()>10000 && m.getPrice()<= 20000)
			{
			m.setPrice(m.getPrice()*1.08);
			}
			
			else if(m.getPrice()>20000 && m.getPrice()<= 30000)
			{
			m.setPrice(m.getPrice()*1.12);
			}
			
			else if(m.getPrice()>30000)
			{
			m.setPrice(m.getPrice()*1.18);
			}
		}
		
		
		System.out.println("\n----List of all Mobile with updated price-------");
		for (Mobile m : l) 
		{
			System.out.println(m);
		}
	}
}
