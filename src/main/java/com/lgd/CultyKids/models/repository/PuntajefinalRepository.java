package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.PuntajeFinal;

@Repository
public interface PuntajefinalRepository extends 
CrudRepository <PuntajeFinal, Long> {

}
 