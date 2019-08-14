package com.mindtree.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.UserResgister;
import com.mindtree.repository.RegistrationRepository;

@Repository
public class RegistrationDaoImpl implements RegistrationDao
{

	@Autowired
	private RegistrationRepository regiRepo;

	@Override
	public UserResgister getUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return regiRepo.findByEmailId(emailId);
	}

}
