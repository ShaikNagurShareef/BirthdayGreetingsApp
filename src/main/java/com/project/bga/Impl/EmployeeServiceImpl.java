package com.project.bga.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.bga.Model.Employee;
import com.project.bga.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	public String addEmployee(@RequestBody Employee employee)
	{
		log.info("Entered into addEmployee()...");
		int numOfUpdatedRows = employeeRepository.saveEmployee(employee);
		if(numOfUpdatedRows<=0)
		{
			log.info("addEmployee() --> Failed...");
			return "Failed";
		}
		log.info("addEmployee() --> Suceess...");
		return "Success";
	}

}
