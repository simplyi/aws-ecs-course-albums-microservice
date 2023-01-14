package com.appsdeveloperblog.photoalbums.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "albums")
public class AlbumEntity implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userId;
    
    @Column(nullable = false, unique = true)
    private String albumId;
 
    @Column(nullable = false, length = 225)
    private String title;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
 
    

}