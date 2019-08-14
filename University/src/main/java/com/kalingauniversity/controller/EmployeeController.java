package com.kalingauniversity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kalingauniversity.model.Employee;
import com.kalingauniversity.service.EmployeeServiceDao;

@RestController
@Profile("dev")
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceDao employeeServiceDao;

	@RequestMapping(value="/get", method = RequestMethod.GET)	 
	public List<Employee> getEmployee() {
		System.out.println("I am reached");
		return employeeServiceDao.getEmployee();
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)	 
	public String hello() {
		System.out.println("I am reached");
		return "Hello Method called form Spring Boot application";
	}
}
