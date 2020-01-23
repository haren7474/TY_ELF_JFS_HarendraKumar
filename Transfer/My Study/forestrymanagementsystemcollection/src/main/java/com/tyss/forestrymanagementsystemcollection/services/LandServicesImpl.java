package com.tyss.forestrymanagementsystemcollection.services;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dao.LandDao;
import com.tyss.forestrymanagementsystemcollection.dto.LandBean;
import com.tyss.forestrymanagementsystemcollection.factory.ForestryManagementSystemFactory;

public class LandServicesImpl implements LandServices
{
	LandDao landDao= ForestryManagementSystemFactory.instanceOfLandDaoImpl();
	@Override
	public List<LandBean> getAllLandRecords() 
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
