package com.tyss.objectclass;

public class TestPen 
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.equals(p));
	}
}
