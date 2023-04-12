package com.emprest.emprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emprest.emprest.entities.Employee;
import com.emprest.emprest.services.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome Employee";
	}
	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.empService.addEmployee(employee);
	}
	
	@PutMapping("/emp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.empService.updateEmployee(employee);
	}
	
	@DeleteMapping("/emp/{Id}")
	public String deleteEmployee(@PathVariable String Id) {
		return this.empService.deleteEmployee(Long.parseLong(Id));
	}
}
