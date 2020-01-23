package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.LandBean;

public interface LandServices 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
	public LandBean getLandById(int landId);
}
