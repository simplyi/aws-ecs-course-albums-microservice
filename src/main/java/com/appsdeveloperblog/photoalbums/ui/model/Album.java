package com.appsdeveloperblog.photoalbums.ui.model;

public class Album {
	private String userId;
	private String albumId;
	private String title;
	
    public Album() {
    	
    }

	public Album(String userId, String albumId, String title) {
		this.userId = userId;
		this.albumId = albumId;
		this.title = title;
	}

	public String getUserId() {
		return userId;
	}

	public String getAlbumId() {
		return albumId;
	}

	public String getTitle() {
		return title;
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
