package com.rtejos.waterbnb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.waterbnb.models.Rating;
import com.rtejos.waterbnb.repositories.RatingRepository;

import java.util.List;

@Service
public class RatingService{
    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getRatingsByPoolId(Long id){
        return ratingRepository.findAllByPoolId(id);
    }

    public Rating saveRating(Rating r){
        return ratingRepository.save(r);
    }
}