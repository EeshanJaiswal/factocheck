package com.factocheck.shift_slot.service;

import java.util.List;
import java.util.Optional;

import com.factocheck.shift_slot.model.ShiftSlotModel;

public interface ShiftSlotService {

	public Optional<ShiftSlotModel> findByShiftSlotId(Long shiftSlotId);
	
	public ShiftSlotModel createShiftSlotDet(ShiftSlotModel shiftSlotDet);
	
	public void deleteShiftSlotDet(Long id);
	
	public List<ShiftSlotModel> findAllShiftSlotDet();
	
}
