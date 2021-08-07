package com.rtejos.lookify.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rtejos.lookify.Models.Song;
import com.rtejos.lookify.Repository.SongRepositoryJpa;
import com.rtejos.lookify.Service.SongService;

@RestController
public class SongApi {
	
	
	private final SongService songService;
	private final SongRepositoryJpa songRepoJpa;

	public SongApi(SongService songService, SongRepositoryJpa songRepoJpa) {
		super();
		this.songService = songService;
		this.songRepoJpa = songRepoJpa;
	}
	
	@RequestMapping(value="/api/dashboard", method=RequestMethod.POST)
	public Song crearSong(@RequestParam(value="title") String name,
						  @RequestParam(value="artist") String artist,
						  @RequestParam(value="rating") int rating) {
		Song song = new Song(name,artist,rating);
		return songService.creaCancion(song);
	}
	
	@RequestMapping(value="/api/search/like", method=RequestMethod.GET)
	public List<Song> searchArtist(@RequestParam("busqueda") String buscaArtista) {
		List<Song> optionArtist = songRepoJpa.buscarArtista(buscaArtista);
		if(optionArtist.isEmpty()) {
			return null;
		} else {
			return optionArtist;
		}
		
	}
	
	
	
}
