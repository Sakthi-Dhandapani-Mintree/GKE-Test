package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GroupRank implements Comparable<GroupRank>{

	@Id
	private String groupName;
	private Integer steps;
	
	
	public GroupRank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getSteps() {
		return steps;
	}
	public void setSteps(Integer steps) {
		this.steps = steps;
	}
	
	@Override
	public int compareTo(GroupRank o) {
		// TODO Auto-generated method stub
		return this.getSteps().compareTo(o.getSteps());
	}
	
}
