package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.EmailBean;

public interface EmailDao {
	public List<EmailBean> getAllEmail();
	public boolean sendEmail(EmailBean emailBean);
	public EmailBean getEmailById(int landEmailID);
}
