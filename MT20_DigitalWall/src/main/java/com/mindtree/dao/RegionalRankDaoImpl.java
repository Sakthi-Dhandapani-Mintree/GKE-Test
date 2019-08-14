package com.mindtree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.RegionalRank;
import com.mindtree.repository.RegionalRankRepository;

@Repository
public class RegionalRankDaoImpl implements RegionalRankDao
{
	@Autowired
	private RegionalRankRepository regionalRankRepo;

	@Override
	public List<RegionalRank> getTopRunnersLocally(String location) {
		// TODO Auto-generated method stub
		return regionalRankRepo.getTopRunnersLocally(location);
	}
	

}
