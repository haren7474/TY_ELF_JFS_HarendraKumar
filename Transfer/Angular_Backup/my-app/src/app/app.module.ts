import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { SectionComponent } from './section/section.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { PrakharComponent } from './prakhar/prakhar.component';
import { HarenComponent } from './haren/haren.component';
import { SwetaComponent } from './sweta/sweta.component';
import { ProductsComponent } from './products/products.component';
import { ImagesComponent } from './images/images.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { BikesComponent } from './bikes/bikes.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    SectionComponent,
    HomeComponent,
    AboutComponent,
    ContactUsComponent,
    RegisterComponent,
    LoginComponent,
    PagenotfoundComponent,
    PrakharComponent,
    HarenComponent,
    SwetaComponent,
    ProductsComponent,
    ImagesComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikeDetailsComponent,
    BikesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      {
        path: 'about', component: AboutComponent,
        // Providing Children for the path about
        children: [
          { path: '', component: HarenComponent },
          { path: 'prakhar', component: PrakharComponent },
          { path: 'sweta', component: SwetaComponent }
        ]
      },
      { path: 'contact-us', component: ContactUsComponent },
      { path: 'products', component: ProductsComponent },
      { path: 'images', component: ImagesComponent },
      { path: 'parent', component: ParentComponent },
      { path: 'bykes', component: BikesComponent },
      { path: 'register', component: RegisterComponent },
      { path: 'login', component: LoginComponent },
      { path: '**', component: PagenotfoundComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
