import { Component, OnInit } from '@angular/core';
import { Contract, ModifiedContract } from '../contracts';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';
import { UserService } from '../users.service';
import { User } from '../users';
import { Observable } from 'rxjs';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-contracts',
  templateUrl: './contracts.component.html',
  styleUrls: ['./contracts.component.css']
})
export class ContractsComponent implements OnInit {

  message: string;
  statusCode: number;
  description: string;


  contracts: Contract[];
  myContracts: ModifiedContract[];
  userName: string;
  users: User[];
  customers: User[];
  hauliers: User[];
  products: Product[];

  constructor(private contractService: ContractService,
    private router: Router,
    private userService: UserService,
    private productService: ProductService
  ) {
    this.getContracts();
    this.getCustomers();
    this.getHauliers();
    this.getProducts();
  }
  getContracts() {
    this.contractService.getData().subscribe(response => {
      console.log(response);
      this.contracts = response.contractBean;
    }, err => {
      console.log(err);
    });
  }

  getFullName(userId: number): string {
    this.userService.getName(userId).subscribe(response => {
      return response.userBean.fullName;
    });
    return null;
  }

  deleteContract(contract: Contract) {
    this.contractService.deleteData(contract).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        this.contracts.splice(this.contracts.indexOf(contract), 1);
        this.statusCode = res.statusCode;
      } else {
        this.message = res.description;
      }
    });
  }
  deleteMessage() {
    this.message = null;
    this.statusCode = null;
  }

  selectContract(contract: Contract) {
    this.contractService.selectedContractToUpdate = contract;
    this.router.navigateByUrl('/updateContract');
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

  ngOnInit() {
  }

}
