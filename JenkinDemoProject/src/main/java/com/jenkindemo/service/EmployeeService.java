package com.jenkindemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenkindemo.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public void Service() {
		employeeDao.Dao();
		System.out.println("Employee Service..");
	}

}
