package com.appsdeveloperblog.photoalbums.ui.model;

public class Album {
	private final String userId;
	private final String albumdId;
	private final String title;
	
	public Album(String userId, String albumdId, String title) {
		this.userId = userId;
		this.albumdId = albumdId;
		this.title = title;
	}

	public String getUserId() {
		return userId;
	}

	public String getAlbumdId() {
		return albumdId;
	}

	public String getTitle() {
		return title;
	}
	
	
	
}
