package com.rtejos.dojosyninjas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rtejos.dojosyninjas.models.Ninja;
import com.rtejos.dojosyninjas.repositorys.NinjaRepoJpa;
import com.rtejos.dojosyninjas.repositorys.NinjaRepository;

@Service
public class NinjaService {
	
	
	private final NinjaRepository ninjaRepo;
	private final NinjaRepoJpa ninjaRepoJpa;

	public NinjaService(NinjaRepository ninjaRepo, NinjaRepoJpa ninjaRepoJpa) {
		this.ninjaRepo = ninjaRepo;
		this.ninjaRepoJpa = ninjaRepoJpa;
	}
	
	public Ninja creaNinja(Ninja n) {
		return ninjaRepo.save(n);	
	}

	
	public List<Ninja> buscaNinjasPorDojoId(Long id) {
		return ninjaRepoJpa.searchNinjaById(id);		
	}
	
	
	private static final int PAGE_SIZE = 5;
    public Page<Ninja> ninjasPerPage(int pageNumber) {
        // Obtener todas las páginas de ninjas y clasificarlas en orden ascendente por apellido.
        PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(Sort.Direction.ASC,"lastName"));
        Page<Ninja> ninjas = ninjaRepo.findAll(pageRequest);
        return ninjaRepo.findAll(pageRequest);
    }
	
}