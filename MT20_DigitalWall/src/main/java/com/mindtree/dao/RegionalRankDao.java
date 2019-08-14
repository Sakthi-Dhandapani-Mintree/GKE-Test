package com.mindtree.dao;

import java.util.List;

import com.mindtree.model.RegionalRank;

public interface RegionalRankDao {

	public List<RegionalRank> getTopRunnersLocally(String location);
}
