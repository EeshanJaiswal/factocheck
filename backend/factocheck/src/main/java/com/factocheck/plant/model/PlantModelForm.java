package com.factocheck.plant.model;

import java.io.Serializable;

public class PlantModelForm {

	
	private Long plantId;
	
	private String plantName;

	public PlantModelForm() {
		
	}

	public PlantModelForm(Long plantId, String plantName) {
		super();
		this.plantId = plantId;
		this.plantName = plantName;
	}

	public Long getPlantId() {
		return plantId;
	}

	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	
	

		
}
