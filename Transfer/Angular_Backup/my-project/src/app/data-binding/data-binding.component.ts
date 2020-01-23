import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  flag = false;
  name = 'Harendra';
  twoWayData;

  isChange = false;

  imgUrl = 'https://cdn.pixabay.com/photo/2019/12/19/21/41/christmas-ornament-4707204_960_720.jpg';


  constructor() {
    setInterval(() => {

      this.flag = !this.flag;
    }, 1000);
  }

  clickMe() {
    console.log('Button Clocked');
    this.isChange = !this.isChange;
  }

  clickMe2(input) {
    console.log(input);
    console.log('----------------')
    console.log(input.value);
  }

  printData() {
    console.log(this.twoWayData);
  }

  ngOnInit() {
  }

}
