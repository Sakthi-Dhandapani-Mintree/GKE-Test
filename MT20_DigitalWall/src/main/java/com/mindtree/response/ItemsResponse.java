package com.mindtree.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ItemsResponse {
	private String kind;
	private String etag;
	private ItemIdResponse id;
	private ItemSnippetResponse snippet;
	public ItemsResponse() {
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
	public ItemIdResponse getId() {
		return id;
	}
	public void setId(ItemIdResponse id) {
		this.id = id;
	}
	public ItemSnippetResponse getSnippet() {
		return snippet;
	}
	public void setSnippet(ItemSnippetResponse snippet) {
		this.snippet = snippet;
	}
	

}
