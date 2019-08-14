package com.mindtree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.GlobalRank;
import com.mindtree.repository.GlobalRankRepository;

@Repository
public class GlobalRankDaoImpl implements GlobalRankDao
{
	@Autowired
    private GlobalRankRepository globalRankRepo;

	@Override
	public List<GlobalRank> getTopRunnersGlobally() {
		// TODO Auto-generated method stub
		return globalRankRepo.getTopRunnersGlobally();
		
	}
	
	
}
