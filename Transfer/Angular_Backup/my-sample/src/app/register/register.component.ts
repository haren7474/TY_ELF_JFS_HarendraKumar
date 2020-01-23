import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.registerForm = new FormGroup({
      name: this.fb.control(null,
        [Validators.required, Validators.minLength(5),
        Validators.pattern('([a-zA-Z]{5,50})')]),

      email: new FormControl(null,
        [Validators.required,
        Validators.email,
        Validators.minLength(8)]),

      mobile: new FormControl(null,
        [Validators.required,
        Validators.pattern('[7-9]{1}[0-9]{9}')]),

      password: new FormControl(null,
        [Validators.required,
        Validators.pattern('(^(?=.{8,32}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*)')]),

      age: new FormControl(null,
        [Validators.required,
        Validators.pattern('(^(100|[1-9][0-9]?)$)')]),

      skills: new FormArray([
        this.getSkill()
      ])
    });
  }

  // to have new form control object
  getSkill(): FormControl {
    return new FormControl(null, [Validators.required, Validators.minLength(3)]);
  }

  // to push form control in forarray
  addSkill() {
    this.skills.push(this.getSkill());
  }

  // to delete each skill
  deleteSkill(i: number) {
    this.skills.removeAt(i);
  }

  get name() {
    return this.registerForm.get('name');
  }

  get email() {
    return this.registerForm.get('email');
  }

  get password() {
    return this.registerForm.get('password');
  }

  get age() {
    return this.registerForm.get('age');
  }

  get mobile() {
    return this.registerForm.get('mobile');
  }
  get skills(): FormArray {
    return this.registerForm.get('skills') as FormArray;
  }

  // called after submitting the form
  submitForm() {
    console.log(this.registerForm.value);
    this.registerForm.reset();
  }

}
