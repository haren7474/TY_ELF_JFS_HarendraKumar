package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.EmailDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

public class EmailServicesImpl implements EmailServices{
	EmailDao emailDao= ForestryManagementSystemFactory.instanceOfEmailDaoImpl();

	@Override
	public List<EmailBean> getAllEmail() {
		return emailDao.getAllEmail();
	}

	@Override
	public boolean sendEmail(EmailBean emailBean) {
		return emailDao.sendEmail(emailBean);
	}

	@Override
	public EmailBean getEmailById(int landEmailID) {
		return emailDao.getEmailById(landEmailID);
	}
	
}
