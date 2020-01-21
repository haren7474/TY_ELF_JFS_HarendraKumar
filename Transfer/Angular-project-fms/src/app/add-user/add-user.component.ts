import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../users.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  message: string;
  statusCode: number;
  description: string;
  error: string;
  constructor(private auth: UserService) {  }

  addUser(form: NgForm) {
    this.auth.postData(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        this.message = res.description;
      } else if (res.statusCode === 401) {
        this.error = res.description;
      }
      form.reset();
      setTimeout(() => {
        this.message = null;
        this.error = null;
      }, 5000);
    });
  }

  ngOnInit() {
  }

}
