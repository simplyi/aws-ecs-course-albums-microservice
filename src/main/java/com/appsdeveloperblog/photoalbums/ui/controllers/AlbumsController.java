package com.appsdeveloperblog.photoalbums.ui.controllers;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.photoalbums.service.AlbumsService;
import com.appsdeveloperblog.photoalbums.ui.model.Album;
 

@RestController
@RequestMapping("/albums")
public class AlbumsController {
	
	@Autowired
	AlbumsService albumsService;
	
	@GetMapping
	public List<Album> getAlbums() {
		return albumsService.getAlbums(UUID.randomUUID().toString());
	}

	@PostMapping
	public Album createAlbum(@Valid @RequestBody Album album) {
		return albumsService.createAlbum(album);
	}

	
}
