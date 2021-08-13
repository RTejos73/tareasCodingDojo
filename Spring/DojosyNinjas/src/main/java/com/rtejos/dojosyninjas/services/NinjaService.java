package com.rtejos.dojosyninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.dojosyninjas.models.Ninja;
import com.rtejos.dojosyninjas.repositorys.NinjaRepoJpa;
import com.rtejos.dojosyninjas.repositorys.NinjaRepository;

@Service
public class NinjaService {
	
	
	private final NinjaRepository ninjaReposiroty;
	private final NinjaRepoJpa ninjaRepoJpa;

	public NinjaService(NinjaRepository ninjaReposiroty, NinjaRepoJpa ninjaRepoJpa) {
		this.ninjaReposiroty = ninjaReposiroty;
		this.ninjaRepoJpa = ninjaRepoJpa;
	}
	
	public Ninja creaNinja(Ninja n) {
		return ninjaReposiroty.save(n);	
	}

	
	public List<Ninja> buscaNinjasPorDojoId(Long id) {
		return ninjaRepoJpa.searchNinjaById(id);		
	}
	
	
	
	
}
