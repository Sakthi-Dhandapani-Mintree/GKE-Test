package com.mindtree.response;


public class OTPDetailResponse {

	private long otp;
	private  String location;
	
	public OTPDetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getOtp() {
		return otp;
	}

	public void setOtp(long otp) {
		this.otp = otp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
