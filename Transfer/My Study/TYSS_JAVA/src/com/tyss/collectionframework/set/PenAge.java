package com.tyss.collectionframework.set;

import java.util.Comparator;

public class PenAge implements Comparator<Pen>
{

	@Override
	public int compare(Pen p1, Pen p2) 
	{
		return p2.age - p1.age;
	}

}
