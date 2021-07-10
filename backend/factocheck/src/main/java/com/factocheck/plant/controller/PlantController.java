//package com.factocheck.plant.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.factocheck.plant.model.PlantModel;
//import com.factocheck.plant.model.PlantModelForm;
//import com.factocheck.plant.service.impl.PlantServiceImpl;
//
//@RestController
//@RequestMapping("/app")
//@CrossOrigin(origins = "*")
//public class PlantController {
//
//	@Autowired
//	private PlantServiceImpl plantService;
//	
//	@PostMapping(value= "/plant")
//	public Object createPlant(@RequestBody PlantModelForm payload, HttpServletRequest request,
//			HttpServletResponse response) throws Exception{
//		try {
//			return plantService.createPlantDet(new PlantModel(payload));
//		} catch (Exception e) {
//			throw e;
//		}
//	}
//	
//	@GetMapping(value = "/plant")
//	public List<PlantModel> findAllPlantDet(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		try {
//			return plantService.findAllPlantDet();
//		}
//		catch (Exception e) {
//			throw e;
//		}
//	}
//	
//	@GetMapping(value="/plant/{id}")
//	public Optional<PlantModel> findPlant(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
//		throws Exception {
//		try {
//			return plantService.findByPlantId(id);
//		}
//		catch (Exception e) {
//			throw e;
//		}
//	}
//	
//	@DeleteMapping(value="/plant")
//	public void deletePlant(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
//		throws Exception {
//		try {
//			plantService.deletePlantDet(id);
//		}
//		catch (Exception e) {
//			throw e;
//		}
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
