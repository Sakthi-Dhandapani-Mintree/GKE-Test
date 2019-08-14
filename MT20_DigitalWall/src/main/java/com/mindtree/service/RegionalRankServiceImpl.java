package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.RegionalRankDao;
import com.mindtree.model.RegionalRank;

@Service
public class RegionalRankServiceImpl implements RegionalRankService
{
	@Autowired
	private RegionalRankDao regionalrankDao;
	
	@Override
	public List<RegionalRank> getTopRunnersLocally(String location) {
		// TODO Auto-generated method stub
		return regionalrankDao.getTopRunnersLocally(location);
	}
	
}
