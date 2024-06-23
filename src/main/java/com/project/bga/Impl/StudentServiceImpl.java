package com.project.bga.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.bga.Model.Student;
import com.project.bga.Repository.StudentRepository;

@Service
public class StudentServiceImpl {
	
	@Autowired
	public StudentRepository studentRepository;
	
	Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	public String addStudent(@RequestBody Student student)
	{
		log.info("Entered into addStudent()...");
		int numOfUpdatedRows = studentRepository.saveStudent(student);
		if(numOfUpdatedRows<=0)
		{
			log.info("addStudent() --> Failed...");
			return "Failed";
		}
		log.info("addStudent() --> Suceess...");
		return "Success";
	}

}
