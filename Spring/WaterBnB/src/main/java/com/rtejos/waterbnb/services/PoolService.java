package com.rtejos.waterbnb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.waterbnb.models.Pool;
import com.rtejos.waterbnb.repositories.PoolRepository;

import java.util.List;

@Service
public class PoolService{
    @Autowired
    PoolRepository poolRepository;

    public List<Pool> getPoolsByHostId(Long id){
        return  poolRepository.findAllByHostId(id);
    }

    public List<Pool> getPoolsByAddress(String address){
        return  poolRepository.findAllByAddressContains(address);
    }

    public Pool savePool(Pool p){
        return poolRepository.save(p);
    }

    public Pool getPoolById(Long id){
        return poolRepository.findById(id).orElse(null);
    }
    public List<Pool> getPools(){
        return poolRepository.findAll();
    }


}
