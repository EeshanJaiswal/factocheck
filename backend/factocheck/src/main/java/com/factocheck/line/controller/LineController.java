package com.factocheck.line.controller;

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

import com.factocheck.line.model.LineModel;
import com.factocheck.line.model.LineModelForm;
import com.factocheck.line.service.impl.LineServiceImpl;

@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "*")
public class LineController {

	@Autowired
	private LineServiceImpl lineService;
	
	@PostMapping(value= "/line")
	public Object createLine(@RequestBody LineModelForm payload, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		try {
			return lineService.createLineDet(new LineModel(payload));
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping(value = "/line")
	public List<LineModel> findAllLineDet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			return lineService.findAllLineDet();
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping(value="/line/{id}")
	public Optional<LineModel> findLine(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		try {
			return lineService.findByLineId(id);
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	@DeleteMapping(value="/line")
	public void deleteLine(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		try {
			lineService.deleteLineDet(id);
		}
		catch (Exception e) {
			throw e;
		}
	}
	
}






