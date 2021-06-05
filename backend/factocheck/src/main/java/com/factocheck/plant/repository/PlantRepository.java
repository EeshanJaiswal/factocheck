package com.factocheck.plant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factocheck.plant.model.PlantModel;

@Repository
public interface PlantRepository extends JpaRepository<PlantModel, Long> {
	
	
}
