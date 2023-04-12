package com.emprest.emprest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprest.emprest.dao.EmpDao;
import com.emprest.emprest.entities.Employee;

@Service 
public class EmpServiceImp implements EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		empDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		empDao.save(employee);
		return employee;
	}

	@Override
	public String deleteEmployee(long parseLong) {
		@SuppressWarnings("deprecation")
		Employee entity = empDao.getOne(parseLong);
		empDao.delete(entity);
		return "deleted";
	}

	


	
}
