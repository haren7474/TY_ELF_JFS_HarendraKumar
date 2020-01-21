import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { UserService } from '../users.service';
import { User } from '../users';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  users: User[];
  message: string;
  statusCode: number;
  error: string;
  currentUser: User;

  constructor(public productService: ProductService,
    private router: Router, private userService: UserService) {
    this.getOwnerUsers();
    this.currentUser = this.productService.selectedProductToUpdate.userBean;
  }

  updateProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        this.router.navigateByUrl('/products');
      }
      form.reset();
    });
  }

  getOwnerUsers() {
    this.userService.getData().subscribe(response => {
      console.log(response);
      this.users = response.userBean.filter((user, index) => {
        return user.userType.toLowerCase() === 'owner' &&
          (user.userId !== this.productService.selectedProductToUpdate.userBean.userId);
      });
    });
  }

  ngOnInit() {
  }

}
