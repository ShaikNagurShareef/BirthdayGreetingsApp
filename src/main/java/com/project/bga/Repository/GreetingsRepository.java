package com.project.bga.Repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bga.Model.Employee;
import com.project.bga.Model.Student;

@Repository
public class GreetingsRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger log = LoggerFactory.getLogger(GreetingsRepository.class);
	
	public List<Student> fetchTodaysBirthdayStudents()
	{
		try
		{
			log.info("Fetching todays Birthday Students...");
			String sql = "SELECT * FROM STUDENT WHERE MONTH(studentDOB)=MONTH(NOW()) AND DAY(studentDOB)=DAY(NOW())";
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return new ArrayList<Student>();
		}
	}
	
	public List<Employee> fetchTodaysBirthdayEmployees()
	{
		try
		{
			log.info("Fetching todays Birthday Employees...");
			String sql = "SELECT * FROM EMPLOYEE WHERE MONTH(employeeDOB)=MONTH(NOW()) AND DAY(employeeDOB)=DAY(NOW())";
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return new ArrayList<Employee>();
		}
	}
	
	public List<Student> fetchMonthlyBirthdayStudents()
	{
		try
		{
			log.info("Fetching Current Month Birthday Students...");
			String sql = "SELECT * FROM STUDENT WHERE MONTH(studentDOB)=MONTH(NOW())";
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return new ArrayList<Student>();
		}
	}
	
	public List<Employee> fetchMonthlyBirthdayEmployees()
	{
		try
		{
			log.info("Fetching Current Month Birthday Employees...");
			String sql = "SELECT * FROM EMPLOYEE WHERE MONTH(employeeDOB)=MONTH(NOW())";
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return new ArrayList<Employee>();
		}
	}

}
