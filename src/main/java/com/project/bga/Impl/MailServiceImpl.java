package com.project.bga.Impl;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl {

	Logger log = LoggerFactory.getLogger(MailServiceImpl.class);

	public void sendEmail(String toEmailAddress, String subjectText, String messageText, String attachmentPath,
			final String userEmailId, final String userPassword) {
		log.info("Entered into sendEmail()...");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userEmailId, userPassword);
			}
		});
		try {
			log.info("Sending Email to: "+toEmailAddress);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userEmailId));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmailAddress));
			message.setSubject(subjectText);
			message.setText(messageText);
			MimeBodyPart messagePart = new MimeBodyPart();
			messagePart.setText(messageText);
			FileDataSource fileDataSource = new FileDataSource(attachmentPath);
			MimeBodyPart attachmentPart = new MimeBodyPart();
			attachmentPart.setDataHandler(new DataHandler(fileDataSource));
			attachmentPart.setFileName(fileDataSource.getName());
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messagePart);
			multipart.addBodyPart(attachmentPart);
			message.setText(messageText);
			message.setContent(multipart);
			Transport.send(message);
			log.info("Email Sent to: "+toEmailAddress);
		} catch (Exception e) {
			log.info(e.getMessage());
			log.info("sendEmail() --> Failed...");
		}
	}

}
