package com.techdroit.quizservice.user.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserStatusController {
	
	@Autowired
	private IUserStatusService alertStatusService;
	
	@GetMapping("user/status")
	public ResponseEntity<List<UserStatus>> getAllAlertStatus(){
		List<UserStatus> list = alertStatusService.getAllAlertStatus();
		return new ResponseEntity<List<UserStatus>>(list, HttpStatus.OK);
	}
}