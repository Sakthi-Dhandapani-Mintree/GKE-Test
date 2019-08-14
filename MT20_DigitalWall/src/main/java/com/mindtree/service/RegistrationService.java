package com.mindtree.service;

import com.mindtree.model.UserResgister;

public interface RegistrationService {
	
	public UserResgister getUserByEmailId(String emailId);
	
}
