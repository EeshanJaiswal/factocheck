export interface shiftSlot{
	slotId: number;	
	slotTime: string;
	LocalDate: Date;
	FillVolumeAllValves: string;
	FillVolumeThreeValvesEveryHour: string;
	ClosureTorque: boolean;
	ClosureJumpTest: boolean;
	ClosurePilferBand: boolean;
	ClosureSecureSeal: boolean;
	StressCrackTest: boolean;
	DropTest: boolean;
	PackageAppearance: string;	
	DateCodingAndRubTest: string;
	
	
}

export class ShiftSlot implements shiftSlot{
    slotId: number;
    slotTime: string;
    LocalDate: any;
    FillVolumeAllValves: string;
    FillVolumeThreeValvesEveryHour: string;
    ClosureTorque: boolean;
    ClosureJumpTest: boolean;
    ClosurePilferBand: boolean;
    ClosureSecureSeal: boolean;
    StressCrackTest: boolean;
    DropTest: boolean;
    PackageAppearance: string;
    DateCodingAndRubTest: string;
    

}


