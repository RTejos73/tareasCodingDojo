package com.rtejos.waterbnb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.waterbnb.models.Size;
import com.rtejos.waterbnb.repositories.SizeRepository;

@Service
public class SizeService{
    @Autowired
    SizeRepository sizeRepository;

    public List<Size> getSizes(){
        return sizeRepository.findAll();
    }
}
