package com.project.bga.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/home")
	public String Home()
	{
		log.info("Loading Home Page...");
		return "home";
	}
	
	@RequestMapping("studentRegistrationForm")
	public String StudentRegistrationForm()
	{
		log.info("Loading Student Registration Page...");
		return "studentRegistration";
	}
	
	@RequestMapping("employeeRegistrationForm")
	public String EmployeeRegistrationForm()
	{
		log.info("Loading Employee Registration Page...");
		return "employeeRegistration";
	}
	
	@RequestMapping("externalGreetings")
	public String ExternalGreetings()
	{
		log.info("Loading External Greetings Page...");
		return "externalGreetings";
	}
	
	@RequestMapping("login")
	public String Login()
	{
		log.info("Loading Login Page...");
		return "login";
	}

}