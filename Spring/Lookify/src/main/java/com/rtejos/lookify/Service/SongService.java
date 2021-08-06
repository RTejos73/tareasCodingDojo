package com.rtejos.lookify.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.lookify.Models.Song;
import com.rtejos.lookify.Repository.SongRepository;


@Service
public class SongService {
	
	
	private final SongRepository songRepository;

	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public List<Song> listSongs() {
		return (List<Song>) songRepository.findAll();
	}
	
	public Song creaCancion(Song sg) {
		return songRepository.save(sg);		
	}
	
	

}
