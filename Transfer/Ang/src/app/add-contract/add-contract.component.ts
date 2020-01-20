import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { UserService } from '../users.service';
import { User } from '../users';
import { NgForm } from '@angular/forms';
import { ContractService } from '../contract.service';
import { Product } from '../product';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {

  message: string;
  statusCode: number;
  error: string;
  customers: User[];
  hauliers: User[];
  products: Product[];

  constructor(private contractService: ContractService,
    private userService: UserService,
    private productService: ProductService) {
    this.getCustomers();
    this.getHauliers();
    this.getProducts();
  }

  getCustomers() {
    this.userService.getData().subscribe(response => {
      console.log(response);
      this.customers = response.userBean.filter((user, index) => {
        return user.userType.toLowerCase() === 'customer';
      });
    });
  }

  getHauliers() {
    this.userService.getData().subscribe(response => {
      console.log(response);
      this.hauliers = response.userBean.filter((user, index) => {
        return user.userType.toLowerCase() === 'haulier';
      });
    });
  }

  getProducts() {
    this.productService.getData().subscribe(response => {
      console.log(response);
      this.products = response.productBean;
    });
  }

  addContract(form: NgForm) {
    this.contractService.postData(form.value).subscribe(data => {
      console.log(data);
      if (this.statusCode === 201) {
        this.message = data.description;
        form.reset();
      } else {
        this.error = data.description;
      }
      setTimeout(() => {
        this.error = null;
        this.message = null;
      }, 2000);
    });
  }

  ngOnInit() {
  }

}
