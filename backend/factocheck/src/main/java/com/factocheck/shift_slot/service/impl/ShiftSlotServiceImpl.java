package com.factocheck.shift_slot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factocheck.shift_slot.model.ShiftSlotModel;
import com.factocheck.shift_slot.repository.ShiftSlotRepository;
import com.factocheck.shift_slot.service.ShiftSlotService;

@Service
public class ShiftSlotServiceImpl implements ShiftSlotService {
	
	@Autowired
	ShiftSlotRepository shiftSlotRepository;
	
	@Override
	public Optional<ShiftSlotModel> findByShiftSlotId(Long shiftSlotId) {
		return shiftSlotRepository.findById(shiftSlotId);
	}

	@Override
	public ShiftSlotModel createShiftSlotDet(ShiftSlotModel shiftSlotDet) {
		return shiftSlotRepository.save(shiftSlotDet);
	}

	@Override
	public void deleteShiftSlotDet(Long shiftSlotId) {
		shiftSlotRepository.deleteById(shiftSlotId);
	}

	@Override
	public List<ShiftSlotModel> findAllShiftSlotDet() {
		return shiftSlotRepository.findAll();
	}
	
}
