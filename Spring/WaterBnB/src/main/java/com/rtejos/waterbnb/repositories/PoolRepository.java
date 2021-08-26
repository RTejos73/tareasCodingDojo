package com.rtejos.waterbnb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.waterbnb.models.Pool;

import java.util.List;

@Repository
public interface PoolRepository extends CrudRepository<Pool,Long>{

    List<Pool> findAllByAddressContains(String location);

    List<Pool> findAllByHostId(Long hostId);

    List<Pool> findAll();
}
