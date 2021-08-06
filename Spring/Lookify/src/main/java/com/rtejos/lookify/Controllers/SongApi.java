package com.rtejos.lookify.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rtejos.lookify.Models.Song;
import com.rtejos.lookify.Service.SongService;

@RestController
public class SongApi {
	
	
	private final SongService songService;

	public SongApi(SongService songService) {
		super();
		this.songService = songService;
	}
	
	@RequestMapping(value="/api/dashboard", method=RequestMethod.POST)
	public Song crearSong(@RequestParam(value="title") String name,
						  @RequestParam(value="artist") String artist,
						  @RequestParam(value="rating") int rating) {
		Song song = new Song(name,artist,rating);
		return songService.creaCancion(song);
	}
}
