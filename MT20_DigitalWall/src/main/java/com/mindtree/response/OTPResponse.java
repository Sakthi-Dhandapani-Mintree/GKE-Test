package com.mindtree.response;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonValue;


@Component
public class OTPResponse {
	
	public String statusCode;
	public  String message;
	public OTPDetailResponse otpDetails; 
	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OTPDetailResponse getOtpDetails() {
		return otpDetails;
	}

	public void setOtpDetails(OTPDetailResponse otpDetails) {
		this.otpDetails = otpDetails;
	}

	public OTPResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
}
