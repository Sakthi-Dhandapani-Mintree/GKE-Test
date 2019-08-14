package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegionalRank {
	
	@Id
	private long uid;
	
	private int rank;
	
	private String location;

	private long steps;
	
	private String name;
	
	public RegionalRank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getSteps() {
		return steps;
	}

	public void setSteps(long steps) {
		this.steps = steps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
