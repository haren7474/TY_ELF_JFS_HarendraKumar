package hebbal.programming.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Please enter size of array");
	int [] a= new int[sc.nextInt()];
	
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println("Enter the value at "+ i + " position");
		a[i]= sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println("Element as position "+ i + " is "+ a[i]);
	}
	
	int j=0;
	int [] b= new int[sc.nextInt()];
	
	for(int i=a.length-1; i>-1;i--)
	{
		b[a.length-1-i]= a[i];
	}
	
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}
	
	System.out.println("Please enter element");
	int count=0;
	int e= sc.nextInt();
	for(int i=0; i<a.length;i++)
	{
		if(e== a[i])
		{
			System.out.println(i+1);
			count++;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("Element not found");
	}
	
	}

}
