package com.mindtree.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class UserResgister {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long uId;
	private String firstName; 
	private String lastName; 
	private String emailId; 
	private String location; 
	private boolean status;
	private boolean mindtreemind;
	private Date consentTimestamp;
	private boolean consentFlag;
	private String registeredDevice;
	private String loginDevice;
	
	private String deviceName;
	private String deviceAppVersion;
	private String deviceOsVersion;
	
	
	/*@Lob
    private byte[] image;*/
	
	

	public UserResgister() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public boolean isConsentFlag() {
		return consentFlag;
	}



	public void setConsentFlag(boolean consentFlag) {
		this.consentFlag = consentFlag;
	}



	public Date getConsentTimestamp() {
		return consentTimestamp;
	}



	public void setConsentTimestamp(Date consentTimestamp) {
		this.consentTimestamp = consentTimestamp;
	}



	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isMindtreemind() {
		return mindtreemind;
	}
	public void setMindtreemind(boolean mindtreemind) {
		this.mindtreemind = mindtreemind;
	}
	/*public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}*/



	public String getRegisteredDevice() {
		return registeredDevice;
	}

	public void setRegisteredDevice(String registeredDevice) {
		this.registeredDevice = registeredDevice;
	}


	public String getLoginDevice() {
		return loginDevice;
	}

	public void setLoginDevice(String loginDevice) {
		this.loginDevice = loginDevice;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceAppVersion() {
		return deviceAppVersion;
	}

	public void setDeviceAppVersion(String deviceAppVersion) {
		this.deviceAppVersion = deviceAppVersion;
	}



	public String getDeviceOsVersion() {
		return deviceOsVersion;
	}



	public void setDeviceOsVersion(String deviceOsVersion) {
		this.deviceOsVersion = deviceOsVersion;
	}
	
	
}
