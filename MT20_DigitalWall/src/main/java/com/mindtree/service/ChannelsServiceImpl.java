package com.mindtree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.ChannelsDao;
import com.mindtree.model.Channels;

@Service
public class ChannelsServiceImpl implements ChannelsService{

	@Autowired
	private ChannelsDao channelsDao;

	@Override
	public Channels getChannelsDetails() {
		// TODO Auto-generated method stub
		return channelsDao.getChannelsDetails();
	}
	
}
