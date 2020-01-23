package hebbal.rootclass.watch;

import java.sql.Time;
import java.util.Date;

public class ObjectWatch 
{
	public static void main(String[] args) 
	{
		Date date= new Date(19,10,10);
		long diff = date.getTime();
		System.out.println("If date is 23-01-1997, " + diff + " have passed.");
		
		System.out.println(java.time.LocalTime.now());  
		System.out.println(java.time.LocalDate.now());  
		
		Watch w1= new Watch(10,10,10);
		Watch w2= new Watch(10,20,10);
	
		if(w1.equals(w2))
		{
			System.out.println("Same time");
		}
		else
		{
			System.out.println("Different time");
		}
		
		System.out.println(w1);
		System.out.println(w2);
	}
	
}
