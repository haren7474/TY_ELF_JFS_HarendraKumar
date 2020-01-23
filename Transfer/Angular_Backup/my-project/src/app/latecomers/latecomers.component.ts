import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-latecomers',
  templateUrl: './latecomers.component.html',
  styleUrls: ['./latecomers.component.css']
})
export class LatecomersComponent implements OnInit {

  lateComers: string[] =
    [
      'Haren',
      'Nitin',
      'Jatin'
    ]

  constructor() { }

  deleteLateComer(name: string)
  {
    this.lateComers.splice()
  }

  ngOnInit() {
  }

}
