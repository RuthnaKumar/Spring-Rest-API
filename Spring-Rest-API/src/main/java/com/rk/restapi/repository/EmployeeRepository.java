package com.rk.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rk.restapi.model.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	//FETCH DATA BY NAME
	List<Employee> findByName(String name);

	//FETCH DATA BY NAME AND LOCATION = (SELECT *FROM table WHERE name="rk" AND location="india")
	List<Employee> findByNameAndLocation(String name,String location);
}
