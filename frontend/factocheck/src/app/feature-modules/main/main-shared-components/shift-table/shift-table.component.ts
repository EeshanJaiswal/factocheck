import { Component, OnInit } from '@angular/core';
import { config } from '@config/config';

@Component({
  selector: 'app-shift-table',
  templateUrl: './shift-table.component.html',
  styleUrls: ['./shift-table.component.scss']
})
export class ShiftTableComponent implements OnInit {
  time= new Date();

  config= config;

  shift_array= [];

  index_map = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

  shift1 = 
  [ "7:00 7:30", "7:30 8:00", "8:00 8:30","8:30 9:00","9:00 9:30", "9:30 10:00","10:00 10:30",
  "10:30 11:00", "11:00 11:30", "11:30 12:00", "12:00 12:30","12:30 13:00","13:00 13:30", "13:30 14:00",
  "14:00 14:30", "14:30 15:00"]

  shift2 = 
  [ "15:00 15:30", "15:30 16:00", "16:00 16:30","16:30 17:00","17:00 17:30", "17:30 18:00","18:00 18:30",
  "18:30 19:00", "19:00 19:30", "19:30 20:00", "20:00 20:30","20:30 21:00","21:00 21:30", "21:30 22:00",
  "22:00 22:30", "22:30 23:00"]

  shift3 = 
  [ "23:00 23:30", "23:30 00:00", "00:00 00:30","00:30 1:00","1:00 1:30", "1:30 2:00","2:00 2:30",
  "2:30 3:00", "3:00 3:30", "3:30 4:00", "4:00 4:30","4:30 5:00","5:00 5:30", "5:30 6:00",
  "6:00 6:30", "6:30 7:00"]

  shift1_start = 7;
  shift2_start = 15;
  shift3_start = 23;

  shiftStartFound = 7;
  shiftNowIndex = 0;


  constructor() {
    this.shift_array = this.shift3;
    this.getShiftIndex()
   }

   getShiftIndex(){
    let hourNow = this.time.getHours();
    let minuteNow = this.time.getMinutes()
    
    // console.log(this.time.getHours());
    //  console.log(this.time.getMinutes());

    if (hourNow >= this.shift1_start && hourNow < this.shift2_start){
      this.shift_array = this.shift1;
      this.shiftStartFound = this.shift1_start;
    }
    else if (hourNow >= this.shift2_start && hourNow< this.shift3_start){
      this.shift_array = this.shift2;
      this.shiftStartFound = this.shift2_start;
    }
    else if (hourNow >= this.shift3_start && hourNow< this.shift1_start){
      this.shift_array = this.shift3;
      this.shiftStartFound = this.shift3_start;
    }

    let probableIndex = [(hourNow - this.shiftStartFound) * 2, ((hourNow - this.shiftStartFound) * 2)+1];

    if (minuteNow >= 30){
      this.shiftNowIndex = probableIndex[1];
    }
    else{
      this.shiftNowIndex = probableIndex[0];
    }
    
    console.log(this.shiftNowIndex, this.shift_array[this.shiftNowIndex])
   }

  ngOnInit(): void {
  }

}
