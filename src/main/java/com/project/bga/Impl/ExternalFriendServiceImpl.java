package com.project.bga.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.bga.Model.ExternalGreetings;
import com.project.bga.Repository.ExternalFriendRepository;

@Service
public class ExternalFriendServiceImpl {
	
	@Autowired
	ExternalFriendRepository externalFriendRepository;
	
	Logger log = LoggerFactory.getLogger(ExternalFriendServiceImpl.class);
	
	public String addFriend(@RequestBody ExternalGreetings friend)
	{
		log.info("Entered into addFriend()...");
		int numOfUpdatedRows = externalFriendRepository.saveFriend(friend);
		if(numOfUpdatedRows<=0)
		{
			log.info("addFriend() --> Failed...");
			return "Failed";
		}
		log.info("addFriend() --> Suceess...");
		return "Success";
	}

}
