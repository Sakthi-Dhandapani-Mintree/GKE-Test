package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.GroupRankDao;
import com.mindtree.model.GroupRank;

@Service
public class GroupRankServiceImpl implements GroupRankService{
	
	@Autowired
	private GroupRankDao groupRankDao;

	@Override
	public List<GroupRank> getGroupList() {
		// TODO Auto-generated method stub
		return groupRankDao.getGroupList();
	}
	
	

}
