package com.techdroit.quizservice.user.roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRoleController {
	
	@Autowired
	private IUserRoleService alertStatusService;
	
	@GetMapping("user/roles")
	public ResponseEntity<List<UserRole>> getAllUserRoles(){
		List<UserRole> list = alertStatusService.getAllUserRoles();
		return new ResponseEntity<List<UserRole>>(list, HttpStatus.OK);
	}
}