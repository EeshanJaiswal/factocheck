package com.factocheck.shift_slot.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factocheck.shift_slot.model.ShiftSlotModel;
import com.factocheck.shift_slot.model.ShiftSlotModelForm;
import com.factocheck.shift_slot.service.impl.ShiftSlotServiceImpl;

@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "*")
public class ShiftSlotController {

	@Autowired
	private ShiftSlotServiceImpl shiftSlotService;
	
	@PostMapping(value= "/slot")
	public Object createLine(@RequestBody ShiftSlotModelForm payload, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		try {
			return shiftSlotService.createShiftSlotDet(new ShiftSlotModel(payload));
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping(value = "/slot")
	public List<ShiftSlotModel> findAllLineDet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			return shiftSlotService.findAllShiftSlotDet();
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping(value="/slot/{id}")
	public Optional<ShiftSlotModel> findLine(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		try {
			return shiftSlotService.findByShiftSlotId(id);
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	@DeleteMapping(value="/slot")
	public void deleteLine(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		try {
			shiftSlotService.deleteShiftSlotDet(id);
		}
		catch (Exception e) {
			throw e;
		}
	}
	
}






