import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  selectedMovie;

  movies = [
    {
      name: 'Spider Man',
      imgUrl: 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      details: 'Rating: 9/10 Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.'
    },
    {
      name: 'Avengers',
      imgUrl: 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      details: 'Rating: 10/10 Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with'
    },
    {
      name: 'Iron Man',
      imgUrl: 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      details: 'Rating: 9/10 When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.'
    } ,
    {
      name: 'Avatar',
      imgUrl: 'https://image.shutterstock.com/image-photo/avatar-woman-magical-forest-260nw-308973533.jpg',
      details: 'Rating: 10/10 Jake, a paraplegic marine, replaces his brother on the Navi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie.'
    }
  ];
  constructor() { }

  selectMovie(movie) {
    this.selectedMovie = movie;
  }
  ngOnInit() {
  }

}
