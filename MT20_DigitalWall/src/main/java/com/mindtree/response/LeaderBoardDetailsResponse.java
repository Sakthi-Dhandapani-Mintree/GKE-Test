package com.mindtree.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mindtree.model.GlobalRank;

import com.mindtree.model.RegionalRank;

@Component
public class LeaderBoardDetailsResponse {
	
	private List<GlobalRank> topRunnersGlobally;
	private List<RegionalRank>  topRunnersLocally;
	private List<GroupRankResponse>  topRunnersLocation;

	public LeaderBoardDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<GlobalRank> getTopRunnersGlobally() {
		return topRunnersGlobally;
	}
	public void setTopRunnersGlobally(List<GlobalRank> topRunnersGlobally) {
		this.topRunnersGlobally = topRunnersGlobally;
	}
	public List<RegionalRank> getTopRunnersLocally() {
		return topRunnersLocally;
	}
	public void setTopRunnersLocally(List<RegionalRank> topRunnersLocally) {
		this.topRunnersLocally = topRunnersLocally;
	}

	public List<GroupRankResponse> getTopRunnersLocation() {
		return topRunnersLocation;
	}

	public void setTopRunnersLocation(List<GroupRankResponse> topRunnersLocation) {
		this.topRunnersLocation = topRunnersLocation;
	}

}
