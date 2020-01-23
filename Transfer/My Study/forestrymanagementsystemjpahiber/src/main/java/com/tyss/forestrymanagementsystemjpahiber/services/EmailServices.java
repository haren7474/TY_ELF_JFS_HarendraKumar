package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;

public interface EmailServices {
	public List<EmailBean> getAllEmail();
	public boolean sendEmail(EmailBean emailBean);
	public EmailBean getEmailById(int landEmailID);
}
