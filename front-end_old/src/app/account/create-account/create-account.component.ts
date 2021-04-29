import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls:['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  formCreateAccount!:FormGroup;
  constructor() { }

  ngOnInit(): void {

    this.formCreateAccount = new FormGroup({
      nome :new FormControl(),
      email:new FormControl(),
      password:new FormControl(),
    });
    
  }

}
