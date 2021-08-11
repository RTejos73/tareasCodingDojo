package com.rtejos.licencias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rtejos.licencias.models.License;

@Repository
public interface LicenseRepoJpa extends JpaRepository<License, Long> {
	
	@Query(value="select * from licenses order by number DESC", nativeQuery=true)
	List<License> buscaPersonaById();
	
	@Query(value="select * from licenses where person_id = ?1", nativeQuery=true)
	List<License> buscaPersonId(Long id);
	
	
}
