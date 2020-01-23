import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-byke-details',
  templateUrl: './byke-details.component.html',
  styleUrls: ['./byke-details.component.css']
})
export class BykeDetailsComponent implements OnInit {

  @Input() bykeDetails;
  constructor() { }

  ngOnInit() {
  }

}
