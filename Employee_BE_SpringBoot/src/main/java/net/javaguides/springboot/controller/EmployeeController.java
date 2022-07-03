package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repositories.IEmployeeRepo;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http:localhost:4200","*"})
public class EmployeeController {
	
	@Autowired 
	private IEmployeeRepo employeeRepository;
	
//	get all employees Rest APi
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
//	Create employee REST API
	@PostMapping("/employees")
	public Employee createEmployee (@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
}
