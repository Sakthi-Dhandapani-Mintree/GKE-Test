package com.mindtree.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.RegistrationDao;
import com.mindtree.model.UserResgister;

@Service
public class RegistrationServiceImpl implements RegistrationService
{

	@Autowired
	private RegistrationDao regDao;
	
	@Override
	public UserResgister getUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return regDao.getUserByEmailId(emailId);
	}
}
