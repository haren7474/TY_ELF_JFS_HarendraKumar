package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.List;
import java.util.Set;

import com.tyss.forestrymanagementsystemcollection.dto.LandBean;

public interface LandDao 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
}
