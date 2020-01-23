import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(public data: DataService) {
    console.log(data.x);
    console.log(data.products);
  }

  deleteProduct(product)
  {
    this.data.products.splice(this.data.products.indexOf(product), 1);
    console.log(this.data.products);
  }

  ngOnInit() {
  }

}
