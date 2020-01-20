package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.EmailDao;
import com.tyss.forestrymanagementsystemboot.dto.EmailBean;

@Service
public class EmailServicesImpl implements EmailServices {
	@Autowired
	private EmailDao emailDao;

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
