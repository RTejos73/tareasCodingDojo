package com.rtejos.muchosamuchos.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.muchosamuchos.models.CategoryProduct;

@Repository
public interface CatProdRepository extends CrudRepository<CategoryProduct, Long> {
	
	
	@Query(value="select * from categories_products where product_id = ?1 ", nativeQuery=true)
	List<CategoryProduct> buscaCatByProdId(Long product_id);
}
