import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {TaskListComponent} from './tasks/task-list/task-list.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './account/login/login.component';
import { CreateAccountComponent } from './account/create-account/create-account.component';
import { HomeComponent } from './layout/home/home.component';
import { AuthenticationComponent } from './layout/authentication/authentication.component';
import { SharedComponent } from './tasks/shared/shared.component';
import { TaskFormComponent } from './tasks/task-form/task-form.component';
import { TaskListItemComponent } from './tasks/task-list-item/task-list-item.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    TaskListComponent,
    CreateAccountComponent,
    HomeComponent,
    AuthenticationComponent,
    SharedComponent,
    TaskFormComponent,
    TaskListItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
