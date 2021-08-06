package com.rtejos.lookify.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.lookify.Models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

}
