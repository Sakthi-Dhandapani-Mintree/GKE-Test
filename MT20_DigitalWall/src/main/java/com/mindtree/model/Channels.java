package com.mindtree.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Channels {

	@Id
	private long channelsId;
	
	private String currentChannel;
	private String nextChannel;
	private String startStr;
	private String midStr;
	private String endStr;
	private Date batonStartTime;
	private Date batonEndTime;
	private String currentPlayList;
	private String nextPlayList;
	
	public Channels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getChannelsId() {
		return channelsId;
	}
	public void setChannelsId(long channelsId) {
		this.channelsId = channelsId;
	}
	public String getCurrentChannel() {
		return currentChannel;
	}
	public void setCurrentChannel(String currentChannel) {
		this.currentChannel = currentChannel;
	}
	public String getNextChannel() {
		return nextChannel;
	}
	public void setNextChannel(String nextChannel) {
		this.nextChannel = nextChannel;
	}
	public String getStartStr() {
		return startStr;
	}
	public void setStartStr(String startStr) {
		this.startStr = startStr;
	}
	public String getMidStr() {
		return midStr;
	}
	public void setMidStr(String midStr) {
		this.midStr = midStr;
	}
	public String getEndStr() {
		return endStr;
	}
	public void setEndStr(String endStr) {
		this.endStr = endStr;
	}

	public Date getBatonStartTime() {
		return batonStartTime;
	}

	public void setBatonStartTime(Date batonStartTime) {
		this.batonStartTime = batonStartTime;
	}

	public Date getBatonEndTime() {
		return batonEndTime;
	}

	public void setBatonEndTime(Date batonEndTime) {
		this.batonEndTime = batonEndTime;
	}

	public String getCurrentPlayList() {
		return currentPlayList;
	}

	public void setCurrentPlayList(String currentPlayList) {
		this.currentPlayList = currentPlayList;
	}

	public String getNextPlayList() {
		return nextPlayList;
	}

	public void setNextPlayList(String nextPlayList) {
		this.nextPlayList = nextPlayList;
	}
	
	
}
