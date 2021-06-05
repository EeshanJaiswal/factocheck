export interface plant{
    plantId?: number;
    plantName: string;
}

export class plant implements plant{
    plantId?: number;
    plantName: string;

    constructor(plantName){
        this.plantName = plantName;
    }
}



