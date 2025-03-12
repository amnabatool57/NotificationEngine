package com.work.inquiryengine.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl {

	@Autowired
	private MailSender mailSender;

	public void sendSimpleMessage(String to, String subject, String text) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);

		try {
			this.mailSender.send(message);
		} catch (MailException ex) {
			// simply log it and go on...
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}

	}
}