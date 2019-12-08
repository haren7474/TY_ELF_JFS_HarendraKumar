package com.tyss.fms.dao;

import java.util.HashSet;
import java.util.Set;

import com.tyss.fms.dto.LandBean;

public class LandDaoImpl implements LandDao
{
	Set<LandBean> landSet= new HashSet<LandBean>();
	
	@Override
	public Set<LandBean> getAllLandRecords() 
	{
		return landSet;
	}

	@Override
	public boolean addLandRecord(LandBean land) 
	{
		int count=0;
		for (LandBean landBean : landSet) 
		{
			if(landBean.getLandId().equalsIgnoreCase(land.getLandId()))
			{
				count++;
			}
		}
		if(count==0)
		{
			landSet.add(land);
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateLandRecord(String landId, double newLandTax) 
	{
		for (LandBean landBean : landSet) 
		{
			if(landBean.getLandId().equalsIgnoreCase(landId))
			{
				landBean.setLandTax(newLandTax);
				return true;
			}
		}
		return false;
	}

}
