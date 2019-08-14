package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSteps {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long usId;
	private long cumulativeStepsCount;
	private long uId;
	private boolean status;
	
	public UserSteps() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserSteps(long usId, long cumulativeStepsCount, long uId, boolean status) {
		super();
		this.usId = usId;
		this.cumulativeStepsCount = cumulativeStepsCount;
		this.uId = uId;
		this.status = status;
	}
	public long getUsId() {
		return usId;
	}
	public void setUsId(long usId) {
		this.usId = usId;
	}
	public long getCumulativeStepsCount() {
		return cumulativeStepsCount;
	}
	public void setCumulativeStepsCount(long cumulativeStepsCount) {
		this.cumulativeStepsCount = cumulativeStepsCount;
	}
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	



}
