package com.rtejos.licencias.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rtejos.licencias.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}
