package com.rtejos.muchosamuchos.servers;

import org.springframework.stereotype.Service;

import com.rtejos.muchosamuchos.models.Product;
import com.rtejos.muchosamuchos.repositorys.ProductRepository;

@Service
public class ProductService {

	
	private final ProductRepository productRepo;

	public ProductService (ProductRepository productRepo) {
		this.productRepo = productRepo;
	}

	public void creaProducto(Product product) {
		productRepo.save(product);
		
	}

	public Product buscaProductoId(Long idProduct) {
		return productRepo.findById(idProduct).orElse(null);
		
	}

}