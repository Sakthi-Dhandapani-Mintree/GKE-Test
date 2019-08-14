package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.model.OTP;

public interface OTPRepository extends JpaRepository<OTP, String>
{
   
	@Query(value="SELECT otp FROM otp where emailid=?1",nativeQuery=true)
	
	public String getOTPByEmailId(String emailid);
}
