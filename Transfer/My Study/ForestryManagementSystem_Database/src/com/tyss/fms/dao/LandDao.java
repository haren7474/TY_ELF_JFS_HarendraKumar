package com.tyss.fms.dao;

import java.util.Set;

import com.tyss.fms.dto.LandBean;

public interface LandDao 
{
	public Set<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
}
