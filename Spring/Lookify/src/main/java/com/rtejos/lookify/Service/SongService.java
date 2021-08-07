package com.rtejos.lookify.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.lookify.Models.Song;
import com.rtejos.lookify.Repository.SongRepository;
import com.rtejos.lookify.Repository.SongRepositoryJpa;


@Service
public class SongService {
	
	
	private final SongRepository songRepository;
	private final SongRepositoryJpa songRepoJpa;


	public SongService(SongRepository songRepository, SongRepositoryJpa songRepoJpa) {
		super();
		this.songRepository = songRepository;
		this.songRepoJpa = songRepoJpa;
	}

	public List<Song> listSongs() {
		return (List<Song>) songRepository.findAll();
	}
	
	public Song creaCancion(Song sg) {
		return songRepository.save(sg);		
	}
	
	public Song buscaPorId(Long id) {
		Optional<Song> optionalS = songRepository.findById(id);
		if(optionalS.isPresent()) {
			return optionalS.get();	
		} else  {
			return null;
		}		
	}
	
	public void deleteSong(Long id) {
		Optional<Song> optionalS = songRepository.findById(id);
		if(optionalS.isPresent()) {
			songRepository.deleteById(id);
		}
	}
	
	
	
	public List<Song> listTopTen() {
		return songRepoJpa.obtenerTopTen();
	}
	
	public List<Song> searchArtist(String buscaArtista) {
		/* return songRepoJpa.buscarArtista(buscaArtista); */
		List<Song> optionArtist = songRepoJpa.buscarArtista(buscaArtista);
		if(optionArtist.isEmpty()) {
			return null;
		} else {
			return optionArtist;
		}
		
	}

}
