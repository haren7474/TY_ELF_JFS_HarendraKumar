import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { BykeComponent } from './byke/byke.component';
import { BykeDetailsComponent } from './byke-details/byke-details.component';
import { FooterComponent } from './footer/footer.component';
import { MovieComponent } from './movie/movie.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { LaptopComponent } from './laptop/laptop.component';
import { LaptopDetailsComponent } from './laptop-details/laptop-details.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarComponent,
    CarDetailsComponent,
    BykeComponent,
    BykeDetailsComponent,
    FooterComponent,
    MovieComponent,
    MovieDetailsComponent,
    LaptopComponent,
    LaptopDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'cars', component: CarComponent },
      { path: 'bykes', component: BykeComponent },
      { path: 'movies', component: MovieComponent },
      { path: 'laptops', component: LaptopComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
