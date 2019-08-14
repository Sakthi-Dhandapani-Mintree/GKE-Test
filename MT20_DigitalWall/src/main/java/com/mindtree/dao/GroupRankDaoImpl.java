package com.mindtree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.GroupRank;
import com.mindtree.repository.GroupRankRepository;

@Repository
public class GroupRankDaoImpl implements GroupRankDao{
	
	@Autowired
	private GroupRankRepository groupRankRepo;
	@Override
	public List<GroupRank> getGroupList() {
		// TODO Auto-generated method stub
		return groupRankRepo.findAll();
	}
	

}
