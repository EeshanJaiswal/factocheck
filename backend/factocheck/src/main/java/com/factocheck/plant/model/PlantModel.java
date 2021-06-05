package com.factocheck.plant.model;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plant")
public class PlantModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plant_generator")
	@SequenceGenerator(name="test_generator", sequenceName= "plant_seq", allocationSize=0)
	@Column(name = "plant_id")
	private Long plantId;
	
	@Column(name = "plant_name")
	private String plantName;
	
	public PlantModel() {
		
	}

	public PlantModel(PlantModelForm plantModelForm) {
		super();
		this.plantId = plantModelForm.getPlantId();
		this.plantName = plantModelForm.getPlantName();
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
