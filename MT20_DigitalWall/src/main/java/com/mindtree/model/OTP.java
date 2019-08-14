package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OTP {
	
	@Id
	private String emailid;
	private String otp;
	
	
	public OTP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OTP(String emailId, String otp) {
		super();
		this.emailid = emailId;
		this.otp = otp;
	}
	
	public String getEmailId() {
		return emailid;
	}
	public void setEmailId(String emailId) {
		this.emailid = emailId;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
}
