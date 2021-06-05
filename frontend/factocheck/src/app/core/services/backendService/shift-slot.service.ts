import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { observable, Observable } from "rxjs";
import { ShiftSlot } from "../../_models/shift-slot";

@Injectable({
  providedIn: 'root'
})
export class ShiftSlotService {

  url = environment.slotUrl;

  constructor(private http:HttpClient) { }


  get() {
    return this.http.get(this.url);
  }
  
  getById(id: number) {
    let queryUrl = this.url + `/${id}`;
    return this.http.get(queryUrl);
  }

  post(body: ShiftSlot){
    return this.http.post(this.url, body);
  }

}
