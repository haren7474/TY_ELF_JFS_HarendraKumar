import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-byke',
  templateUrl: './byke.component.html',
  styleUrls: ['./byke.component.css']
})
export class BykeComponent implements OnInit {
  selectedByke;

  bykes = [
    {
      name: 'BMW',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343_960_720.jpg',
      details: 'The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945. Automobiles are marketed under the brands BMW.'
    },
    {
      name: 'Enfield',
      imgUrl: 'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231_960_720.jpg',
      details: 'Royal Enfield is an Indian motorcycle manufacturing brand with the tag of "the oldest global motorcycle brand in continuous production" manufactured in factories in Chennai in India. Licensed from Royal Enfield by the indigenous Indian Madras Motors, it is now a subsidiary of Eicher Motors Limited, an Indian automaker.'
    },
    {
      name: 'Hero',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/02/19/11/23/bicycle-1209682_960_720.jpg',
      details: 'Hero Cycles was established in 1956 in Ludhiana Punjab and started with manufacturing bicycle components. Today, Hero Cycles is one of the worlds largest manufacturers of bicycles and producing 19,000 cycles per day. Hero Cycles is part of Hero Motors Company'
    } ,
    {
      name: 'Ducati',
      imgUrl: 'https://cdn.pixabay.com/photo/2018/02/14/05/55/wheel-3152176_960_720.jpg',
      details: 'Ducati is a group of companies, best known for manufacturing motorcycles and headquartered in Borgo Panigale, Bologna, Italy. The group is owned by German automotive manufacturer Audi through its Italian subsidiary Lamborghini, which is in turn owned by the Volkswagen Group.'
    }
  ];
  constructor() { }

  selectByke(byke) {
    this.selectedByke = byke;
  }
  ngOnInit() {
  }

}
