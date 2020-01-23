package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.LandDao;
import com.tyss.forestrymanagementsystemboot.dto.LandBean;

@Service
public class LandServicesImpl implements LandServices {
	@Autowired
	private LandDao landDao;

	@Override
	public List<LandBean> getAllLandRecords() {
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
