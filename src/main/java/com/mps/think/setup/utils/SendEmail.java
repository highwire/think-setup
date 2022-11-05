package com.mps.think.setup.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

	@Autowired
	EmailInfo emailInfo;

	public void send(String password, String to) {
		// Get properties object
		Properties props = new Properties();
		props.put("mail.smtp.host", emailInfo.getSmtpHost());
		props.put("mail.smtp.socketFactory.port", emailInfo.getPort());
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", emailInfo.getSmtpAuth());
		props.put("mail.smtp.port", emailInfo.getPort());
		props.put("mail.smtp.starttls.enable", "true");
		// get Session
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailInfo.getAuthUser(), password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(AppConstants.Email_Subject);
			String htmlText = AppConstants.Email_User_Name + AppConstants.Email_Semi + to
					+ AppConstants.Email_User_Password + AppConstants.Email_Semi + password;
			//message.setContent(htmlText, "text/html");
			message.setText(htmlText);
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}