package com.furkankara.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furkankara.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		
		// create employees
		Employee emp1 = new Employee(1,"Leslie","Andrews","leslie@gmail.com");
		Employee emp2 = new Employee(2,"John","Mehdi","john@gmail.com");
		Employee emp3 = new Employee(3,"Hasan","Adams","hasan@gmail.com");
		
		// create the list
		theEmployees = new ArrayList<>();
		
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);

		
		// add to the list
	}
	
	
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		//add to the spring model
		theModel.addAttribute("employees",theEmployees);
		
		return "list-employees";
		
		
	}
	
	
	
	
}
