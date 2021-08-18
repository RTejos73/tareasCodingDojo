package com.rtejos.muchosamuchos.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.muchosamuchos.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
