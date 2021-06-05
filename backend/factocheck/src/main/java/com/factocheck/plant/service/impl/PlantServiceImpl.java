package com.factocheck.plant.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factocheck.plant.model.PlantModel;
import com.factocheck.plant.repository.PlantRepository;
import com.factocheck.plant.service.PlantService;

@Service
public class PlantServiceImpl implements PlantService {
	
	@Autowired
	PlantRepository plantRepository;

	@Override
	public Optional<PlantModel> findByPlantId(Long plantId) {
		return plantRepository.findById(plantId);
	}

	@Override
	public PlantModel createPlantDet(PlantModel plantDet) {
		return plantRepository.save(plantDet);
	}

	@Override
	public void deletePlantDet(Long plantId) {
		plantRepository.deleteById(plantId);
	}

	@Override
	public List<PlantModel> findAllPlantDet() {
		return plantRepository.findAll();
	}
	

}
