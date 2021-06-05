package com.factocheck.line.service;

import java.util.List;
import java.util.Optional;

import com.factocheck.line.model.LineModel;

public interface LineService {

	public Optional<LineModel> findByLineId(Long lineId);
	
	public LineModel createLineDet(LineModel lineDet);
	
	public void deleteLineDet(Long id);
	
	public List<LineModel> findAllLineDet();
	
}
