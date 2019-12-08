package com.tyss.fms.services;

import java.util.Set;

import com.tyss.fms.dto.LandBean;

public interface LandServices 
{
	public Set<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(String landId, double landTax);
}
