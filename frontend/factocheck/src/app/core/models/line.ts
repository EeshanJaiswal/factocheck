export interface line{
    lineId?: number;
    lineName: string;
}

export class line implements line{
    lineId?: number;
    lineName: string;

    constructor(lineName){
        this.lineName = lineName;
    }
}



