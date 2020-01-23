package com.tyss.forestrymanagementsystemjpahiber.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;

public interface EmailDao {
	public List<EmailBean> getAllEmail();
	public boolean sendEmail(EmailBean emailBean);
	public EmailBean getEmailById(int landEmailID);
}
