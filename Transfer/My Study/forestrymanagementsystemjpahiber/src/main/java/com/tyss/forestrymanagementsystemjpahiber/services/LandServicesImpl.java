package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.LandDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.LandBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

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

	@Override
	public LandBean getLandById(int landId) {
		return landDao.getLandById(landId);
	}
}
