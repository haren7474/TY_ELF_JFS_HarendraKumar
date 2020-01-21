import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AddUserComponent } from './add-user/add-user.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { DeleteUserComponent } from './delete-user/delete-user.component';
import { UsersComponent } from './users/users.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FilterUserPipe } from './filter-user.pipe';
import { ProductsComponent } from './products/products.component';
import { AddProductComponent } from './add-product/add-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { FilterProductPipe } from './filter-product.pipe';
import { FilterContractPipe } from './filter-contract.pipe';
import { ContractsComponent } from './contracts/contracts.component';
import { AddContractComponent } from './add-contract/add-contract.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    LoginComponent,
    PagenotfoundComponent,
    AddUserComponent,
    UpdateUserComponent,
    DeleteUserComponent,
    UsersComponent,
    FilterUserPipe,
    ProductsComponent,
    AddProductComponent,
    UpdateProductComponent,
    DeleteProductComponent,
    FilterProductPipe,
    FilterContractPipe,
    ContractsComponent,
    AddContractComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'about', component: AboutComponent },
      { path: 'login', component: LoginComponent },
      { path: 'users', component: UsersComponent },
      { path: 'addUser', component: AddUserComponent },
      { path: 'updateUser', component: UpdateUserComponent },
      { path: 'products', component: ProductsComponent },
      { path: 'addProduct', component: AddProductComponent },
      { path: 'updateProduct', component: UpdateProductComponent },
      { path: 'contracts', component: ContractsComponent },
      { path: 'addContracts', component: AddContractComponent },

      { path: '**', component: PagenotfoundComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
