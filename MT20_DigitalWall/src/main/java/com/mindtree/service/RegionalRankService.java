package com.mindtree.service;

import java.util.List;

import com.mindtree.model.RegionalRank;

public interface RegionalRankService {
	
	public List<RegionalRank> getTopRunnersLocally(String location);
}
