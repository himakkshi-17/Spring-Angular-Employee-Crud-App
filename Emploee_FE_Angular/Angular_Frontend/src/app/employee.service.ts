import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8008/api/v1/employees";

  // injecting Http client in the Service file of Angular
  constructor(private httpClient : HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
     return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee: Employee): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}` , employee);
  } 

}
