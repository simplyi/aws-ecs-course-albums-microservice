package com.appsdeveloperblog.photoalbums.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<AlbumEntity, Long> {
	List<AlbumEntity> findAllByUserId(String userId);
}

