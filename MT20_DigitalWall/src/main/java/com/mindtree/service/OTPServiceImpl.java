package com.mindtree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.OTPDao;

@Service
public class OTPServiceImpl implements OTPService{

	@Autowired
	private OTPDao otpDao;
	

	@Override
	public String getOTPByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return otpDao.getOTPByEmailId(emailId);
	}
	

}
