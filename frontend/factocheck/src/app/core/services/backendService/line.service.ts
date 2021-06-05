import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '@environments/environment';
import { observable, Observable } from "rxjs";
import { line } from "@core/models/line";

@Injectable({
  providedIn: 'root'
})
export class LineService {

  url = environment.lineUrl;

  constructor(private http:HttpClient) { }


  get() {
    return this.http.get(this.url);
  }

  getById(id: number) {
    let queryUrl = this.url + `/${id}`;
    return this.http.get(queryUrl);
  }

  post(body: line){
    return this.http.post(this.url, body);
  }

}
