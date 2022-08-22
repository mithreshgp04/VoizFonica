import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-onoff',
  templateUrl: './onoff.component.html',
  styleUrls: ['./onoff.component.css']
})
export class OnoffComponent implements OnInit {
  flag=false;

  constructor() { }

  ngOnInit(): void {
    console.log("MIthresh",(sessionStorage.getItem('mith')));
    console.log("onoff component 1",sessionStorage.getItem('mith'));

    
    if(sessionStorage.getItem('mith')==='1'){
      console.log("onoff component true block",sessionStorage.getItem('mith'));
      console.log("MIthresh",(sessionStorage.getItem('mith')));
      this.flag= true;
  
    }else{
  
      this.flag=false;
      console.log("onoff component false block",sessionStorage.getItem('mith'));
  
    } //when form is getting submitted we need to make log in button is not visible
  }

}
