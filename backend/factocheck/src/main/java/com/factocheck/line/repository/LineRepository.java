package com.factocheck.line.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factocheck.line.model.LineModel;

@Repository
public interface  LineRepository extends JpaRepository<LineModel, Long>  {


	
}
	
	