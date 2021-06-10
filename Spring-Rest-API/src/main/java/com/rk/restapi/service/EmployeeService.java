package com.rk.restapi.service;

import java.util.List;
import com.rk.restapi.model.Employee;
public interface EmployeeService {
	
	List<Employee> getEmployees(int pageNumber , int pageSize);
	//SAVE DATA TO DATABASE
	Employee saveEmployee (Employee employee);
	//FETCH SINGLE DATA FROM DATABASE
	Employee getSingleEmployee(Long id);
	//DELETE DATA FROM DATABASE
	void deleteEmployee(Long id);
	//UPDATE DATA TO DATABASE
	Employee updateEmployee(Employee employee);
	//FETCH DATA BY NAME
	List<Employee> getEmployeesByName(String name);
	//FETCH DATA BY NAME AND LOCATION
	List<Employee> getEmployeesByNameAndLocation(String name,String location);
}
