package com.appsdeveloperblog.photoalbums.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.photoalbums.data.AlbumEntity;
import com.appsdeveloperblog.photoalbums.data.AlbumsRepository;
import com.appsdeveloperblog.photoalbums.ui.model.Album;

@Service
public class AlbumsServiceImpl implements AlbumsService {
	
	@Autowired
	AlbumsRepository albumsRepository;

	@Override
	public List<Album> getAlbums(String userId) {
		
		List<AlbumEntity> albumEntities = (List<AlbumEntity>) albumsRepository.findAllByUserId(userId);

		if (albumEntities == null || albumEntities.isEmpty())
			return new ArrayList<>();

		Type listType = new TypeToken<List<Album>>() {
		}.getType();

		return new ModelMapper().map(albumEntities, listType);
	}

	@Override
	public Album createAlbum(Album album) {
		album.setAlbumId(UUID.randomUUID().toString());
		
		AlbumEntity albumEntity = new AlbumEntity();
		BeanUtils.copyProperties(album, albumEntity);
		
		AlbumEntity storedAlbumEntity = albumsRepository.save(albumEntity);
		
		Album returnValue = new Album();
		BeanUtils.copyProperties(storedAlbumEntity, returnValue);
		
		return returnValue;
	}

}
