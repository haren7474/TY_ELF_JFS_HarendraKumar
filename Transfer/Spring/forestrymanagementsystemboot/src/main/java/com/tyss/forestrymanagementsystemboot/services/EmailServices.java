package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.EmailBean;

public interface EmailServices {
	public List<EmailBean> getAllEmail();
	public boolean sendEmail(EmailBean emailBean);
	public EmailBean getEmailById(int landEmailID);
}
