package com.project.bga.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.bga.Impl.ExternalFriendServiceImpl;
import com.project.bga.Impl.GreetingsServiceImpl;
import com.project.bga.Model.ExternalGreetings;

@Controller
public class ExternalFriendController {
	
	@Autowired
	ExternalFriendServiceImpl externalFriendServiceImpl;
	
	@Autowired
	GreetingsServiceImpl greetingsServiceImpl;
	
	@Value("${greetings.external.filepath}")
	String filePath;
	
	Logger log = LoggerFactory.getLogger(ExternalFriendController.class);
	
	@RequestMapping(value="/friend", method=RequestMethod.POST)
	public String ExternalFriend(ExternalGreetings eg, Model model)
	{
		log.info("Entered into ExternalFriendController...");
		String status = externalFriendServiceImpl.addFriend(eg);
		
		log.info("Preparing Response Page...");
		
		if(status.equals("Success"))
		{
			model.addAttribute("status",status);
			model.addAttribute("message", "Congratulations...");
		}
		
		else
		{
			model.addAttribute("status",status);
			model.addAttribute("message", "Greetings to given EmailId  were already sent by you...");
		}
		
		model.addAttribute("name", eg.getFriendName());
		model.addAttribute("phone", eg.getFriendPhoneNumber());
		model.addAttribute("email", eg.getFriendEmail());
		model.addAttribute("esubject", eg.getFriendMailSubject());
		model.addAttribute("emessage", eg.getFriendMailMessage());
		model.addAttribute("fname", eg.getFriendRefereeName());
		model.addAttribute("femail", eg.getFriendRefereeEmail());
		
		log.info("Generating Greeting Card for External Friend...");
		String fileName = greetingsServiceImpl.generateExternalGreetingCard(eg.getFriendName(), eg.getFriendRefereeName(), eg.getFriendRefereeEmail(), filePath);
		log.info("Generated Greeting Card for External Friend...");
		
		//Send Generated Greeting Card using fileName, friendEmail, Mail Subject, Mail Message
		
		log.info("Loading Response Page...");
		
		return "friendResponse";
	}

}
