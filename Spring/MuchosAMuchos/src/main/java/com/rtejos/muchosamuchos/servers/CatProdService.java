package com.rtejos.muchosamuchos.servers;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.muchosamuchos.models.CategoryProduct;
import com.rtejos.muchosamuchos.repositorys.CatProdRepository;

@Service
public class CatProdService {
	
	private final CatProdRepository catprodRepo;
	
	public CatProdService(CatProdRepository catprodRepo) {
		this.catprodRepo = catprodRepo;
	}

	public List<CategoryProduct> buscaCatporIdProd(Long idProd) {
		return (List<CategoryProduct>) catprodRepo.buscaCatByProdId(idProd);
	}

}
