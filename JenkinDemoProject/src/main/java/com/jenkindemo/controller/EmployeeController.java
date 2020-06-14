package com.jenkindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkindemo.service.EmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("emp")
	public String Controller() {
		employeeService.Service();
		System.out.println("Employee Controller..");
		return "Jenkin Demo Project Success";
	}

}
