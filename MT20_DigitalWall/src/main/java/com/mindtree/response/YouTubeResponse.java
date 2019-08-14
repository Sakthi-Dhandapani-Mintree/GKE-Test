package com.mindtree.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class YouTubeResponse {
	private String kind;
	private String etag;
	private String regionCode;
	
	private ItemsResponse[] items;
	
	
	
	public YouTubeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	
	public ItemsResponse[] getItems() {
		return items;
	}
	public void setItems(ItemsResponse[] items) {
		this.items = items;
	}
	
	

}
