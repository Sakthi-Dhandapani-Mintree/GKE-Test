package com.mindtree.response;

import org.springframework.stereotype.Component;

@Component
public class GroupRankResponse {
	
	private String name;
	private Integer steps;
	private Integer rank;
	
	
	public Integer getSteps() {
		return steps;
	}
	public void setSteps(Integer steps) {
		this.steps = steps;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public GroupRankResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
