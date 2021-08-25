
package com.rtejos.dojosyninjas.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rtejos.dojosyninjas.models.Ninja;

@Repository
public interface NinjaRepoJpa extends JpaRepository<Ninja, Long> {
	
	@Query(value="SELECT * FROM ninja WHERE dojo_id = ?1", nativeQuery=true)
	List<Ninja> searchNinjaById(Long id);
	
	

}