package com.project.bga.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.bga.Impl.GreetingsServiceImpl;

@Controller
public class GreetingsController {
	
	@Autowired
	public GreetingsServiceImpl greetingsServiceImpl;
	
	Logger log = LoggerFactory.getLogger(GreetingsController.class);
	
	@Value("${greetings.student.filepath}")
	String studentFilePath;
	
	@Value("${greetings.employee.filepath}")
	String employeeFilePath;
	
	@Value("${greetings.mail.username}")
	String userEmailId;
	@Value("${greetings.mail.password}")
	String userPassword;
	
	@RequestMapping(value="/studentGreetings", method=RequestMethod.GET)
	public String studentGreetings(Model model)
	{
		List <String> greetings = greetingsServiceImpl.generateStudentGreetings(studentFilePath,userEmailId,userPassword);
		int len = greetings.size();
		model.addAttribute("greetingsPath",greetings.get(len-1));
		
		System.out.println(greetings);
		return "studentGreetings";
		
	}
	
	@RequestMapping(value="/employeeGreetings", method=RequestMethod.GET)
	public String employeeGreetings(Model model)
	{
		List <String> greetings = greetingsServiceImpl.generateEmployeeGreetings(employeeFilePath,userEmailId,userPassword);
		int len = greetings.size();
		model.addAttribute("greetingsPath",greetings.get(len-1));
		
		System.out.println(greetings);
		return "employeeGreetings";
		
	}
	
	@RequestMapping(value="/monthlyGreetings", method=RequestMethod.GET)
	public String monthlyGreetings(Model model)
	{
		List<String> documents = greetingsServiceImpl.generateMonthlyGreetings(studentFilePath, employeeFilePath, userEmailId,userPassword);
		model.addAttribute("studentDocument",documents.get(0));
		model.addAttribute("employeeDocument",documents.get(1));
		
		return "monthlyGreetings";
	}

}
