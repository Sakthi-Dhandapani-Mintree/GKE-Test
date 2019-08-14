package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.GlobalRankDao;
import com.mindtree.model.GlobalRank;

@Service
public class GlobalRankServiceImpl implements GlobalRankService{

	@Autowired
	private GlobalRankDao globalRankDao;

	@Override
	public List<GlobalRank> getTopRunnersGlobally() {
		// TODO Auto-generated method stub
		return globalRankDao.getTopRunnersGlobally();
	}

}
