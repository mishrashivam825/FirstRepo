package com.emprest.emprest.services;

import com.emprest.emprest.entities.Employee;

public interface EmpService {

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public String deleteEmployee(long Id);
	
}

