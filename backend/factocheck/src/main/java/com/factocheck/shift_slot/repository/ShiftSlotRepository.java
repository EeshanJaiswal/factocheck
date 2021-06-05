package com.factocheck.shift_slot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factocheck.shift_slot.model.ShiftSlotModel;

@Repository
public interface  ShiftSlotRepository extends JpaRepository<ShiftSlotModel, Long>  {


	
}
	
	