package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.model.UserSteps;

public interface StepsCountRepository extends JpaRepository<UserSteps, Long>{
	
	@Query(value="SELECT IFNULL(SUM(cumulative_steps_count),0) FROM user_steps",nativeQuery=true)
	
	public long getTotalStepsCount();

}
