package com.mindtree.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.repository.StepsCountRepository;

@Repository
public class UserStepsDaoImpl implements UserStepsDao{
	@Autowired
	private StepsCountRepository userStepsrepo;

	@Override
	public long getTotalStepsCount() {
		// TODO Auto-generated method stub
		return userStepsrepo.getTotalStepsCount();
	}
}
