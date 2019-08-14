package com.mindtree.response;

import org.springframework.stereotype.Component;

@Component
public class TotalStepsResponse {
	private long totalStepsAchieved;

	public long getTotalStepsAchieved() {
		return totalStepsAchieved;
	}

	public void setTotalStepsAchieved(long totalStepsAchieved) {
		this.totalStepsAchieved = totalStepsAchieved;
	}

	public TotalStepsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
