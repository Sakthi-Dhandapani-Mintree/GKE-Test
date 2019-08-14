package com.mindtree.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ItemSnippetResponse {
	private String publishedAt;
	private String channelId;
	private String title;
	private String description;
	//private ThumbnailsResponse thumbnails;
	private String channelTitle;
	private String liveBroadcastContent;
	public ItemSnippetResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/*public ThumbnailsResponse getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(ThumbnailsResponse thumbnails) {
		this.thumbnails = thumbnails;
	}*/
	public String getChannelTitle() {
		return channelTitle;
	}
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	public String getLiveBroadcastContent() {
		return liveBroadcastContent;
	}
	public void setLiveBroadcastContent(String liveBroadcastContent) {
		this.liveBroadcastContent = liveBroadcastContent;
	}
	
	
}
