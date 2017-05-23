package com.spring.freemarker.service;

import com.spring.freemarker.bean.Mail;

public interface MailService {

	 public void sendEmail(Mail mail) throws Exception;
}
