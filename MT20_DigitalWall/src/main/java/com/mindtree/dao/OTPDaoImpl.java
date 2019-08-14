package com.mindtree.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.OTP;
import com.mindtree.repository.OTPRepository;

@Repository
public class OTPDaoImpl implements OTPDao{

	@Autowired
	OTPRepository otpRepo;

	@Override
	public String getOTPByEmailId(String emailId) {
		
		return otpRepo.getOTPByEmailId(emailId);
	}
	
	
}
