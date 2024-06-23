package com.project.bga.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bga.Model.ExternalGreetings;

@Repository
public class ExternalFriendRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger log = LoggerFactory.getLogger(EmployeeRepository.class);
	
	public int saveFriend(ExternalGreetings eg)
	{
		try
		{
			log.info("Entered into saveFriend()...");
			String query = "INSERT INTO EXTERNAL_FRIENDS(friendName,friendPhoneNumber,friendEmail,friendMailSubject,friendMailMessage,friendRefereeName,friendRefereeEmail) VALUES (?,?,?,?,?,?,?)";
			return jdbcTemplate.update(query, eg.getFriendName(), eg.getFriendPhoneNumber(), eg.getFriendEmail(), eg.getFriendMailSubject(), eg.getFriendMailMessage(), eg.getFriendRefereeName(), eg.getFriendRefereeEmail());
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return 0;
		}
	}

}
