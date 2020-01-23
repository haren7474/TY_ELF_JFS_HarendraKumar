package edu.spiders.onetomany.util;

import edu.spiders.onetomany.dao.OneToManyMappingDAO;

public class OneToManyMappingUtil 
{
	public static void main(String[] args) 
	{
		OneToManyMappingDAO dao= new OneToManyMappingDAO();		
		dao.createBatches(1);
	}
}
