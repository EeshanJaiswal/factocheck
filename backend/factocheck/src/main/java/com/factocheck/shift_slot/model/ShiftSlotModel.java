package com.factocheck.shift_slot.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shift_slot")
public class ShiftSlotModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "slot_generator")
	@SequenceGenerator(name="slot_generator", sequenceName= "slot_seq", allocationSize=0)
	@Column(name = "slot_id")
	private Long slotId;
	
	@Column(name = "slot_time")
	private String slotTime;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "fill_volume_all_valves")
	private String FillVolumeAllValves;
	
	@Column(name = "fill_volume_three_valves_every_hour")
	private String FillVolumeThreeValvesEveryHour;
													
	@Column(name = "closure_torque")
	private Boolean  ClosureTorque;
	
	@Column(name = "closure_jump_test")
	private Boolean  ClosureJumpTest;
	
	@Column(name = "closure_pilfer_band")
	private Boolean ClosurePilferBand;
	
	@Column(name = "closure_secure_seal")
	private Boolean ClosureSecureSeal;
	
	@Column(name = "stress_crack_test")
	private Boolean StressCrackTest;

	@Column(name = "drop_test")
	private Boolean DropTest;
	
	@Column(name = "package_appearance")
	private String PackageAppearance;
	
	@Column(name = "date_coding_and_rub_test ")
	private String DateCodingAndRubTest;
	
	public ShiftSlotModel() {
		
	}

	public ShiftSlotModel(ShiftSlotModelForm shiftSlotModelForm) {
		super();
		this.slotId = shiftSlotModelForm.getSlotId();
		this.slotTime = shiftSlotModelForm.getSlotTime();
		this.date = shiftSlotModelForm.getDate();
		this.FillVolumeAllValves = shiftSlotModelForm.getFillVolumeAllValves();
		this.FillVolumeThreeValvesEveryHour = shiftSlotModelForm.getFillVolumeThreeValvesEveryHour();
		this.ClosureTorque = shiftSlotModelForm.getClosureTorque();
		this.ClosureJumpTest = shiftSlotModelForm.getClosureJumpTest();
		this.ClosurePilferBand = shiftSlotModelForm.getClosurePilferBand();
		this.ClosureSecureSeal = shiftSlotModelForm.getClosureSecureSeal();
		this.StressCrackTest = shiftSlotModelForm.getStressCrackTest();
		this.DropTest = shiftSlotModelForm.getDropTest();
		this.PackageAppearance = shiftSlotModelForm.getPackageAppearance();
		this.DateCodingAndRubTest = shiftSlotModelForm.getDateCodingAndRubTest();
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
