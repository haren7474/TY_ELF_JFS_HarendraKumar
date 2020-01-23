import { Component, OnInit, DoCheck, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  dataFromChild;

  student = {
    name: 'Haren',
    age: 26,
    marks: 60
  };
  constructor() {
    console.log('Parent component Constructor called');
  }

  getChildData(data) {
    this.dataFromChild = data;
  }
  ngOnInit() {
    console.log('OninIt Method called');
  }
  ngDoCheck() {
    console.log('Do Check');
  }

  ngDestroy() {
    console.log('Destroy method executed');
  }

  ngAfterComponentInit() {
    console.log('After Component in it executed');
  }

  ngAfterComponentChecked() {
    console.log('After Component checked')
  }

}
