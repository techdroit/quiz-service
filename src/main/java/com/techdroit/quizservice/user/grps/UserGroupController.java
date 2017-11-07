package com.techdroit.quizservice.user.grps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserGroupController {
	
	@Autowired
	private IUserGroupService alertStatusService;
	
	@GetMapping("user/groups")
	public ResponseEntity<List<UserGroup>> getAllUserGroups(){
		List<UserGroup> list = alertStatusService.getAllUserGroups();
		return new ResponseEntity<List<UserGroup>>(list, HttpStatus.OK);
	}
}