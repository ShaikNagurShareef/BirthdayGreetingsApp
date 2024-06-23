package com.project.bga.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bga.Model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger log = LoggerFactory.getLogger(EmployeeRepository.class);
	
	public int saveEmployee(Employee emp)
	{
		try 
		{
			log.info("Entered into saveEmployee()...");
			String query = "INSERT INTO EMPLOYEE(employeeId,employeeName,employeeBranch,employeeGender,employeePhoneNumber,employeeEmail,employeeDOB) VALUES (?,?,?,?,?,?,?)";
			return jdbcTemplate.update(query, emp.getEmployeeId(), emp.getEmployeeName(), emp.getEmployeeBranch(), emp.getEmployeeGender(), emp.getEmployeePhoneNumber(), emp.getEmployeeEmail(), emp.getEmployeeDOB());
		} 
		catch(Exception e)
		{
			log.info(e.getMessage());
			return 0;
		}
	}
	
}
