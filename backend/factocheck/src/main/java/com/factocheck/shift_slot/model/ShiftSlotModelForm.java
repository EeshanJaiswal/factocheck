package com.factocheck.shift_slot.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

public class ShiftSlotModelForm {

	
	private Long slotId;
	
	private String slotTime;
	
	private LocalDate date;
	
	private String FillVolumeAllValves;
	
	private String FillVolumeThreeValvesEveryHour;
	
	private Boolean  ClosureTorque;
	
	private Boolean  ClosureJumpTest;
	
	private Boolean ClosurePilferBand;
	
	private Boolean ClosureSecureSeal;
	
	private Boolean StressCrackTest;

	private Boolean DropTest;
	
	private String PackageAppearance;
	
	private String DateCodingAndRubTest;
	

	public ShiftSlotModelForm() {
		
	}


	public ShiftSlotModelForm(Long slotId, String slotTime, LocalDate date, String fillVolumeAllValves,
			String fillVolumeThreeValvesEveryHour, Boolean closureTorque, Boolean closureJumpTest,
			Boolean closurePilferBand, Boolean closureSecureSeal, Boolean stressCrackTest, Boolean dropTest,
			String packageAppearance, String dateCodingAndRubTest) {
		super();
		this.slotId = slotId;
		this.slotTime = slotTime;
		this.date = date;
		FillVolumeAllValves = fillVolumeAllValves;
		FillVolumeThreeValvesEveryHour = fillVolumeThreeValvesEveryHour;
		ClosureTorque = closureTorque;
		ClosureJumpTest = closureJumpTest;
		ClosurePilferBand = closurePilferBand;
		ClosureSecureSeal = closureSecureSeal;
		StressCrackTest = stressCrackTest;
		DropTest = dropTest;
		PackageAppearance = packageAppearance;
		DateCodingAndRubTest = dateCodingAndRubTest;
	}

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public String getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getFillVolumeAllValves() {
		return FillVolumeAllValves;
	}

	public void setFillVolumeAllValves(String fillVolumeAllValves) {
		FillVolumeAllValves = fillVolumeAllValves;
	}

	public String getFillVolumeThreeValvesEveryHour() {
		return FillVolumeThreeValvesEveryHour;
	}

	public void setFillVolumeThreeValvesEveryHour(String fillVolumeThreeValvesEveryHour) {
		FillVolumeThreeValvesEveryHour = fillVolumeThreeValvesEveryHour;
	}

	public Boolean getClosureTorque() {
		return ClosureTorque;
	}

	public void setClosureTorque(Boolean closureTorque) {
		ClosureTorque = closureTorque;
	}

	public Boolean getClosureJumpTest() {
		return ClosureJumpTest;
	}

	public void setClosureJumpTest(Boolean closureJumpTest) {
		ClosureJumpTest = closureJumpTest;
	}

	public Boolean getClosurePilferBand() {
		return ClosurePilferBand;
	}

	public void setClosurePilferBand(Boolean closurePilferBand) {
		ClosurePilferBand = closurePilferBand;
	}

	public Boolean getClosureSecureSeal() {
		return ClosureSecureSeal;
	}

	public void setClosureSecureSeal(Boolean closureSecureSeal) {
		ClosureSecureSeal = closureSecureSeal;
	}

	public Boolean getStressCrackTest() {
		return StressCrackTest;
	}

	public void setStressCrackTest(Boolean stressCrackTest) {
		StressCrackTest = stressCrackTest;
	}

	public Boolean getDropTest() {
		return DropTest;
	}

	public void setDropTest(Boolean dropTest) {
		DropTest = dropTest;
	}

	public String getPackageAppearance() {
		return PackageAppearance;
	}

	public void setPackageAppearance(String packageAppearance) {
		PackageAppearance = packageAppearance;
	}

	public String getDateCodingAndRubTest() {
		return DateCodingAndRubTest;
	}

	public void setDateCodingAndRubTest(String dateCodingAndRubTest) {
		DateCodingAndRubTest = dateCodingAndRubTest;
	}
	
	
	
}
