package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dto.LandBean;

public interface LandServices 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
}
