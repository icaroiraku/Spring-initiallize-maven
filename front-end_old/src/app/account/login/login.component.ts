import { Component, OnInit } from '@angular/core';
import { AccountService } from '../shared/account.service';
import { Router }from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls:['./login.component.css']
  
})

export class LoginComponent implements OnInit {
  


  formLogin!: FormGroup;

  constructor(
    private accountService: AccountService,
    private router: Router

  ) { }

  ngOnInit() {
    this.formLogin = new FormGroup({
      email:new FormControl(),
      password:new FormControl(),
    });
  }

  async onSubmit(){
    try{
      const result = await this.accountService.login(this.formLogin);
      console.log('Login efetuado: ${result}');

      this.router.navigate(['']);
    }catch (error){
      console.error(error);
    }
  }

  onSubmit1(): void{

       

  }

 




}
