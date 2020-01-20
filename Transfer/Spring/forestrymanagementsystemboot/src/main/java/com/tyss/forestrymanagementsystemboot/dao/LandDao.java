package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.LandBean;

public interface LandDao 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
	public LandBean getLandById(int landId);
}
