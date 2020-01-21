import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';
import { UserService } from '../users.service';
import { User } from '../users';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  message: string;
  statusCode: number;
  error: string;
  users: User[];
  constructor(private productService: ProductService, private userService: UserService) {
    this.getOwnerUsers();
  }

  getOwnerUsers() {
    this.userService.getData().subscribe(response => {
      console.log(response);
      this.users = response.userBean.filter((user, index) => {
        return user.userType.toLowerCase() === 'owner';
      });
    });
  }

  addProduct(form: NgForm) {
    this.productService.postData(form.value).subscribe(data => {
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
