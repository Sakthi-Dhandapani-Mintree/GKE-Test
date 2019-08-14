package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindtree.model.UserResgister;

public interface RegistrationRepository extends JpaRepository<UserResgister, Long>
{
	public UserResgister findByEmailId(String emailId );
    
}
