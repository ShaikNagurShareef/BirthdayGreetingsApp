package com.project.bga.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.bga.Impl.EmployeeServiceImpl;
import com.project.bga.Model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeServiceImpl employeeServiceImpl;
	
	Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public String Employee(Employee e, Model model)
	{
		log.info("Entered into Employee Controller...");
		String status = employeeServiceImpl.addEmployee(e);
		
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
		
		model.addAttribute("id", e.getEmployeeId());
		model.addAttribute("name", e.getEmployeeName());
		model.addAttribute("branch", e.getEmployeeBranch());
		model.addAttribute("gender", e.getEmployeeGender());
		model.addAttribute("phone", e.getEmployeePhoneNumber());
		model.addAttribute("email", e.getEmployeeEmail());
		model.addAttribute("dob", e.getEmployeeDOB());
		
		log.info("Loading Response Page...");
		
		return "response";
	}

}
