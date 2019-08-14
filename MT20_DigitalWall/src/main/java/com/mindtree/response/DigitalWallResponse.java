package com.mindtree.response;

import org.springframework.stereotype.Component;

@Component
public class DigitalWallResponse {
	private String statusCode;
	private  String message;
	private TotalStepsResponse totalStepsDetails;
	
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
	
	
	public TotalStepsResponse getTotalStepsDetails() {
		return totalStepsDetails;
	}
	public void setTotalStepsDetails(TotalStepsResponse totalStepsDetails) {
		this.totalStepsDetails = totalStepsDetails;
	}
	public DigitalWallResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
