package com.appsdeveloperblog.photoalbums.data;

import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<AlbumEntity, Long> {
}

