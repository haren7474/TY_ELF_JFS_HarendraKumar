package edu.spiders.java.practice.array;

import java.util.Arrays;

public class ArrayOccurence 
{
	
	public static void main(String[] args) 
	{
		
		int [] a= {1,1,3,3,3,4,5,5,6,6,1};
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+ " "+ count);
			i=i+count-1;
		}	
	}
	
	
}
