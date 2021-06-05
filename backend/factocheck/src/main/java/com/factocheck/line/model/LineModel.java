package com.factocheck.line.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "line")
public class LineModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "line_generator")
	@SequenceGenerator(name="test_generator", sequenceName= "line_seq", allocationSize=0)
	@Column(name = "line_id")
	private Long lineId;
	
	@Column(name = "line_name")
	private String lineName;
	
	public LineModel() {
	}
	
	public LineModel(LineModelForm lineModelForm) {
		super();
		this.lineId = lineModelForm.getLineId();
		this.lineName = lineModelForm.getLineName();
	}

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	
	
	
	
	

}
