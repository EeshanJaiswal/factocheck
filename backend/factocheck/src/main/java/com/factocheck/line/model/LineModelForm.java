package com.factocheck.line.model;

import java.io.Serializable;

public class LineModelForm {

	
	private Long lineId;
	
	private String lineName;
	
	public LineModelForm() {
		
	}

	public LineModelForm(Long lineId, String lineName) {
		super();
		this.lineId = lineId;
		this.lineName = lineName;
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
