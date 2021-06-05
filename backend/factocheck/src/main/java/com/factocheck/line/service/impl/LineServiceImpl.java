package com.factocheck.line.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factocheck.line.model.LineModel;
import com.factocheck.line.repository.LineRepository;
import com.factocheck.line.service.LineService;

@Service
public class LineServiceImpl implements LineService {
	
	@Autowired
	LineRepository lineRepository;

	@Override
	public Optional<LineModel> findByLineId(Long lineId) {
		return lineRepository.findById(lineId);
	}

	@Override
	public LineModel createLineDet(LineModel lineDet) {
		return lineRepository.save(lineDet);
	}

	@Override
	public void deleteLineDet(Long lineId) {
		lineRepository.deleteById(lineId);
	}

	@Override
	public List<LineModel> findAllLineDet() {
		return lineRepository.findAll();
	}
	
}
