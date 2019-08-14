package com.mindtree.response;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonValue;


@Component
public class LeaderBoardResponse {

	private String statusCode;
	
	private  String message;
	private LeaderBoardDetailsResponse leaderBoardDetails; 
	
	public LeaderBoardResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LeaderBoardDetailsResponse getLeaderBoardDetails() {
		return leaderBoardDetails;
	}

	public void setLeaderBoardDetails(LeaderBoardDetailsResponse leaderBoardDetails) {
		this.leaderBoardDetails = leaderBoardDetails;
	}

	

}
