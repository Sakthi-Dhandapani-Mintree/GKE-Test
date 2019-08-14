package com.mindtree.util;

import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

/**
 * The Class EmailSender.
 */
@Component
public class EmailSender {

	/** The logger. */
	//private LoggerUtil logger = new LoggerUtil(EmailSender.class);

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public boolean sendSimpleMessage(Map<String, String> yahoomailData,long emailCount) {
				
				boolean mailStatus=false;
				try {
			         Session session =null;
			        Properties prop = new Properties();
					prop.put("mail.smtp.host", "smtp.gmail.com");
			        prop.put("mail.smtp.port", "587");
			        prop.put("mail.smtp.auth", "true");
			        prop.put("mail.smtp.starttls.enable", "true"); //TLS
			        
			        if(emailCount%2==0) {
				         
				         final String username = "m20sup@gmail.com";
				         final String password = "#Welcome1234";
				         session = Session.getInstance(prop,
					                new javax.mail.Authenticator() {
					                    protected PasswordAuthentication getPasswordAuthentication() {
					                        return new PasswordAuthentication(username, password);
					                    }
					                });
				         }
				         else {
				        	 
				        	 final String  username = "m20sup1@gmail.com";
				        	 final String  password = "#welcome1234";
					         session = Session.getInstance(prop,
						                new javax.mail.Authenticator() {
						                    protected PasswordAuthentication getPasswordAuthentication() {
						                        return new PasswordAuthentication(username, password);
						                    }
						                });
				         }
			        
			         

			        try {

			            Message message = new MimeMessage(session);
			            message.setFrom(new InternetAddress("m20sup@gmail.com"));
			            message.setRecipients(
			                    Message.RecipientType.TO,
			                    InternetAddress.parse(yahoomailData.get("contactEmail"))
			            );
			            message.setSubject(yahoomailData.get("subject"));
			          
			            message.setContent(yahoomailData.get("body"),"text/html");
			          

			            Transport.send(message);
			            mailStatus=true;
			            

			        } catch (MessagingException e) {
			        	
			           logger.error("Error while Sending mail from gmail::"+e);
			        }
			    
		        return mailStatus;
				}catch (Exception e) {
					// TODO: handle exception
					 logger.error("Error while Sending mail from gmail::"+e);
					 return mailStatus;
				}
		       
		    }
}
