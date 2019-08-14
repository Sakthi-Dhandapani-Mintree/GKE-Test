package com.mindtree.dao;

import com.mindtree.model.UserResgister;

public interface RegistrationDao {
	UserResgister getUserByEmailId(String emailId);
}
