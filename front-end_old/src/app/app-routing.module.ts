import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateAccountComponent } from './account/create-account/create-account.component';
import { LoginComponent } from './account/login/login.component';
import { FormularioComponent } from './seguradora/formulario/formulario.component';


const routes: Routes = [
  { path: 'login',  component:LoginComponent},
  { path: 'create-account', component:CreateAccountComponent},
  { path: 'formulario', component:FormularioComponent}
    
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
