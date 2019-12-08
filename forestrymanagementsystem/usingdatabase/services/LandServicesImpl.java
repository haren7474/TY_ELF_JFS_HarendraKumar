package com.tyss.fms.services;

import java.util.Set;

import com.tyss.fms.dao.LandDao;
import com.tyss.fms.dto.LandBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;

public class LandServicesImpl implements LandServices
{
	LandDao landDao= ForestryManagementSystemFactory.instanceOfLandDaoImpl();
	@Override
	public Set<LandBean> getAllLandRecords() 
	{
		return landDao.getAllLandRecords();
	}

	@Override
	public boolean addLandRecord(LandBean land) {
		return landDao.addLandRecord(land);
	}

	@Override
	public boolean updateLandRecord(int landId, double landTax) {
		return landDao.updateLandRecord(landId, landTax);
	}
}
