package hebbal.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) 
	{
		ArrayList coll1= new ArrayList();
		ArrayList coll2= new ArrayList();
		
		coll1.add(43);
		coll1.add('A');
		coll1.add("Hello");
		coll1.add("Lipsa");
		coll1.add(43);
		coll1.add("Sachin");
		coll1.add("Hello");
		coll1.add(2.2);
		coll1.add(null);
		coll1.add("Shobhit");
		coll1.add("Mishra");
		
		Integer ip= 22;
		coll1.remove(ip);
		System.out.println(coll1); //[43, A, Hello, Lipsa, 43, Sachin, Hello, 1.23, null, Shobhit, Mishra]
		
		
		//Display only Integers
		System.out.println("Q1");
		for(int i=0; i< coll1.size(); i++)
		{
			Object obj= coll1.get(i);
			if(obj instanceof Integer)
			{
				System.out.print(obj+ " "); // 43 43 
			}
		}
		
		//Display both double and string		
		System.out.println("Q2");
		for(int i=0; i< coll1.size(); i++)
		{
			Object obj= coll1.get(i);
			if(obj instanceof String || obj instanceof Double)
			{
				System.out.print(obj+ " "); // 43 43 Hello Lipsa Sachin Hello 1.23 Shobhit Mishra 
			}
		}
		
		//Q3 Display only Even Integers
				System.out.println("Q3");
				for(int i=0; i< coll1.size(); i++)
				{
					Object obj= coll1.get(i);
					if(obj instanceof Integer)
					{
						if(Integer.parseInt(obj.toString())%2==0)
						{
						System.out.print(obj+ " "); // 22 
						}
					}
				}
				
			
				//Q4 Display only string Starts with S		
				System.out.println("\n\nQ4 Below, Only String starts with S");
				for(int i=0; i< coll1.size(); i++)
				{
					Object obj= coll1.get(i);
					if(obj instanceof String)
					{
						if((obj.toString()).startsWith("S"))
						{
							System.out.print(obj); //SachinShobhit
						}
					}
				}
				
				//Q5 Display only string ends with sa		
				System.out.println("\n\nQ5 Below, Only String ends with sa");
				for(int i=0; i< coll1.size(); i++)
				{
					Object obj= coll1.get(i);
					if(obj instanceof String)
					{
						if((obj.toString()).endsWith("sa"))
						{
							System.out.print(obj); //Lipsa
						}
					}
				}
				
				
				//Q6 Replace all even with odd and odd with even
				
				System.out.println("\n\nBelow Q6, replace");
				System.out.println("Originol>> "+ coll1);
				for(int i=0; i< coll1.size(); i++)
				{
					Object obj= coll1.get(i);
					if(obj instanceof Integer)
					{
						Integer itr= (Integer) obj;
						
						if(itr%2==0)
						{
						coll1.set(i, itr+1);
						}
						else
						{
						coll1.set(i, itr+1);
						}
					}
				}
				
				System.out.println("\nReplaced>> "+ coll1);
				
				
				//Q7 Except String and Integer, remove rest all
				
				System.out.println("\n\nBelow Q7, remove all except String and Integer");
				System.out.println("Originol>> "+ coll1);
				for(int i=0; i< coll1.size(); i++)
				{
					Object obj= coll1.get(i);
					if(obj instanceof String || obj instanceof Integer)
					{
						coll2.add(obj);
						
					}
				}
				
				coll1.retainAll(coll2);
				
				System.out.println("Retained>> "+ coll1);
				
				
				//Q8 Reverse objects of ArrayList
				int len= coll1.size()-1;
				for(int i=0; i<=len/2;i++)
				{
					Object obj1= coll1.get(i);
					Object obj2= coll1.get(len);
					coll1.set(i, obj2);
					coll1.set(len, obj1);
					len--;
				}
				
				System.out.println("Reversed>> "+ coll1);
				
				//Q9 Reverse objects of ArrayList of ques 8 with different logic
				
				for(int i=0; i<=coll1.size()/2;i++)
				{
					Object obj= coll1.get(i);
					
					coll1.set(i, coll1.get(coll1.size()-1-i));
					coll1.set(coll1.size()-1-i, obj);
				}
				
				System.out.println("Again Reversed>> "+ coll1);
				
				//Q10.
				Collections.reverse(coll1);
	}

}
