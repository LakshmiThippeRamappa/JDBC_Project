package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployee();
	int addEmployee(Employee employee);
}
