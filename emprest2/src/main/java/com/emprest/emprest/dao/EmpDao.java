package com.emprest.emprest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emprest.emprest.entities.Employee;

public interface EmpDao extends JpaRepository<Employee, Long> {


}
