package com.appsdeveloperblog.photoalbums.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.appsdeveloperblog.photoalbums.ui.model.Album;

@Service
public class AlbumsServiceImpl implements AlbumsService {

	@Override
	public List<Album> getAlbums(String userId) {
		
		Album album1 = new Album(userId, UUID.randomUUID().toString(), "Album title one");
		Album album2 = new Album(userId, UUID.randomUUID().toString(), "Album title two");
		Album album3 = new Album(userId, UUID.randomUUID().toString(), "Album title three");
		 
		return Arrays.asList(album1, album2, album3);
	}

}
