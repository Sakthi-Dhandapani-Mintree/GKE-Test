package com.mindtree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.UserStepsDao;

@Service
public class UserStepsServiceImpl implements UserStepsService{

	@Autowired
	private UserStepsDao userStepsDao;
	@Override
	public long getTotalStepsCount() {
		// TODO Auto-generated method stub
		return userStepsDao.getTotalStepsCount();
	}

}
