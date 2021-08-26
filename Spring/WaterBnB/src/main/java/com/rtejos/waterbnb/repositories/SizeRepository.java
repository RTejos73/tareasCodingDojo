package com.rtejos.waterbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.waterbnb.models.Size;

@Repository
public interface SizeRepository extends CrudRepository<Size,Long>{
    List<Size> findAll();
}
