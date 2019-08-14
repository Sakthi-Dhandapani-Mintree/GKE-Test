package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.model.Channels;

public interface ChannelsRepository extends JpaRepository<Channels, Long>{
	
	
	@Query(value="select *from channels where baton_start_time<= now() and baton_end_time>= now()",nativeQuery=true)
	public Channels getChannelDetails();
	
	
}
