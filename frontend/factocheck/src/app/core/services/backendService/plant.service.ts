import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { observable, Observable } from "rxjs";
import { plant } from "../../_models/plant";

@Injectable({
  providedIn: 'root'
})
export class PlantService {

  url = environment.plantUrl;

  constructor(private http:HttpClient) { }


  get() {
    return this.http.get(this.url);
  }
  
  getById(id: number) {
    let queryUrl = this.url + `/${id}`;
    return this.http.get(queryUrl);
  }

  post(body: plant){
    return this.http.post(this.url, body);
  }

}
