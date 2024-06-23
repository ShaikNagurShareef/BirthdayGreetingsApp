package com.project.bga.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.bga.Impl.StudentServiceImpl;
import com.project.bga.Model.Student;

@Controller
public class StudentController {
	
	@Autowired
	public StudentServiceImpl studentServiceImpl;
	
	Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String Student(Student s, Model model)
	{
		log.info("Entered into Student Controller...");
		String status = studentServiceImpl.addStudent(s);
		
		log.info("Preparing Response Page...");
		
		if(status.equals("Success"))
		{
			model.addAttribute("status",status);
			model.addAttribute("message", "Congratulations...");
		}
		
		else
		{
			model.addAttribute("status",status);
			model.addAttribute("message", "User with given Id already Exists...");
		}
		
		model.addAttribute("id", s.getStudentId());
		model.addAttribute("name", s.getStudentName());
		model.addAttribute("branch", s.getStudentBranch());
		model.addAttribute("gender", s.getStudentGender());
		model.addAttribute("phone", s.getStudentPhoneNumber());
		model.addAttribute("email", s.getStudentEmail());
		model.addAttribute("dob", s.getStudentDOB());
		
		log.info("Loading Response Page...");
		
		return "response";
	}

}
