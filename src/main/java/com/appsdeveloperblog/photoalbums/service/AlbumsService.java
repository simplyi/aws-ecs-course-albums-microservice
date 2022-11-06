package com.appsdeveloperblog.photoalbums.service;

import java.util.List;

import com.appsdeveloperblog.photoalbums.ui.model.Album;

public interface AlbumsService {
	List<Album> getAlbums(String userId);
	Album createAlbum(Album album);

}
