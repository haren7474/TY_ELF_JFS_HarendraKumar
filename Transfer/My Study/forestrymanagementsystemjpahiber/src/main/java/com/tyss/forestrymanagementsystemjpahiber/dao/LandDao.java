package com.tyss.forestrymanagementsystemjpahiber.dao;

import java.util.List;
import java.util.Set;

import com.tyss.forestrymanagementsystemjpahiber.dto.LandBean;

public interface LandDao 
{
	public List<LandBean> getAllLandRecords();
	public boolean addLandRecord(LandBean land);
	public boolean updateLandRecord(int landId, double landTax);
	public LandBean getLandById(int landId);
}
