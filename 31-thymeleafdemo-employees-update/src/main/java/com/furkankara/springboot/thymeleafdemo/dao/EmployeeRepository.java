package com.furkankara.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furkankara.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//that's it ...no need to write any code
	
	//add a method to sort by last name
	
	//Spring data JPAS will parse the method name
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
