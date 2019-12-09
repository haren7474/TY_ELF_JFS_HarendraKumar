package com.tyss.collectionframework.set;

import java.util.Comparator;

public class PenName implements Comparator<Pen>
{

	@Override
	public int compare(Pen p1, Pen p2) 
	{
		return p2.name.compareTo(p1.name);
	}

}
