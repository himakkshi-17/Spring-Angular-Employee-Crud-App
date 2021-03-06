import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

// Routes array will contail all the routes
const routes: Routes = [  
  // as soon as we hit localhost:4200 it will redirect to employees

  {path : 'employees' , component: EmployeeListComponent},
  {path : 'create-employee', component: CreateEmployeeComponent},
  {path : '' ,  redirectTo : 'employees', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
