package com.rtejos.lookify.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import com.rtejos.lookify.Models.Song;

@Repository
public interface SongRepositoryJpa extends  JpaRepository<Song, Long> {
	
	@Query(value= "SELECT * FROM songs order by rating DESC limit 10", nativeQuery=true)
	List<Song> obtenerTopTen();
	
	@Query(value= "SELECT * FROM songs WHERE artist like %?1%", nativeQuery=true)
	List<Song> buscarArtista(String artist);

}
