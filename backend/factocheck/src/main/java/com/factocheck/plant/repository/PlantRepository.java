//package com.factocheck.plant.repository;
//
//import java.io.Serializable;
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.factocheck.plant.model.PlantModel;
//
//@Repository
//public interface PlantRepository<PlantModel, ID extends Serializable> extends JpaRepository<PlantModel, Long> {
//	List<PlantModel> findAll(Sort sort);
//    Page<PlantModel> findAll(Pageable pageable);
//	
//}
//
