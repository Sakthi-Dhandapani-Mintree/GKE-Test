package com.mindtree.response;


public class YouTubeStatusResponse {
	public String statusCode;
	public  String message;
	private YouTubeResponseFinal[] currentChannelVideos;
	private YouTubeResponseFinal[] nextChannelVideos;
	private PlayListResponse playLists;
	
	
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

	
	public YouTubeResponseFinal[] getCurrentChannelVideos() {
		return currentChannelVideos;
	}

	public void setCurrentChannelVideos(YouTubeResponseFinal[] currentChannelVideos) {
		this.currentChannelVideos = currentChannelVideos;
	}

	public YouTubeResponseFinal[] getNextChannelVideos() {
		return nextChannelVideos;
	}

	public void setNextChannelVideos(YouTubeResponseFinal[] nextChannelVideos) {
		this.nextChannelVideos = nextChannelVideos;
	}

	
	
	public PlayListResponse getPlayLists() {
		return playLists;
	}

	public void setPlayLists(PlayListResponse playLists) {
		this.playLists = playLists;
	}

	public YouTubeStatusResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
