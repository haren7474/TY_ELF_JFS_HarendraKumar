import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptop-details',
  templateUrl: './laptop-details.component.html',
  styleUrls: ['./laptop-details.component.css']
})
export class LaptopDetailsComponent implements OnInit {

  @Input() laptopDetails;
  constructor() { }

  ngOnInit() {
  }

}
