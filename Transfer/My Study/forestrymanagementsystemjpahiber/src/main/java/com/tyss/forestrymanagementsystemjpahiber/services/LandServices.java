package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.LandBean;

public interface LandServices 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
	public LandBean getLandById(int landId);
}
