package com.rtejos.waterbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.waterbnb.models.Rating;

@Repository
public interface RatingRepository extends CrudRepository<Rating,Long>{

    List<Rating> findAllByPoolId(Long id);
}