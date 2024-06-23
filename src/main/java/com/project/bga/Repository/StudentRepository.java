package com.project.bga.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bga.Model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger log = LoggerFactory.getLogger(StudentRepository.class);
	
	public int saveStudent(Student s)
	{
		try 
		{
			log.info("Entered into saveStudent()...");
			String query = "INSERT INTO STUDENT(studentId,studentName,studentBranch,studentGender,studentPhoneNumber,studentEmail,studentDOB) VALUES (?,?,?,?,?,?,?)";
			return jdbcTemplate.update(query, s.getStudentId(), s.getStudentName(), s.getStudentBranch(), s.getStudentGender(), s.getStudentPhoneNumber(), s.getStudentEmail(), s.getStudentDOB());
		} 
		catch(Exception e)
		{
			log.info(e.getMessage());
			return 0;
		}
	}

}
