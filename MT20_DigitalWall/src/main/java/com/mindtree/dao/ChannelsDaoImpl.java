package com.mindtree.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.model.Channels;
import com.mindtree.repository.ChannelsRepository;

@Repository
public class ChannelsDaoImpl implements ChannelsDao{

	@Autowired
	private ChannelsRepository channelsRepo;

	@Override
	public Channels getChannelsDetails() {
		// TODO Auto-generated method stub
		return channelsRepo.getChannelDetails();
	}
	
	
	
}
