import { Component, OnInit } from '@angular/core';
import { UserService } from '../users.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  constructor(private userService: UserService, private router: Router) { }

  updateUser(form: NgForm) {
    this.userService.updateData(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        this.router.navigateByUrl('/users');
      }
      form.reset();
    });
  }

  ngOnInit() {
  }

}
