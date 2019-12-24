package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dao.LandDao;
import com.tyss.forestrymanagementsystem_hibernate.dto.LandBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;

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
