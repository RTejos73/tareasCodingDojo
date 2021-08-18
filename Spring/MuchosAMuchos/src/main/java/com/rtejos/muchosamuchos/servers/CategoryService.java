package com.rtejos.muchosamuchos.servers;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.muchosamuchos.models.Category;
import com.rtejos.muchosamuchos.repositorys.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository categoryRepo;
	
	public CategoryService(CategoryRepository categoryRepo) {
		this.categoryRepo = categoryRepo;
	}

	

	public void creaCategoria(Category categoria) {
		categoryRepo.save(categoria);		
	}



	public List<Category> buscaCategorias() {
		return (List<Category>) categoryRepo.findAll();
	}

}
