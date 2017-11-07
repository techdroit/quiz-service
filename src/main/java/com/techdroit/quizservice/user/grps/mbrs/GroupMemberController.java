package com.techdroit.quizservice.user.grps.mbrs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupMemberController {
	
	@Autowired
	private IGroupMemberService alertStatusService;
	
	@GetMapping("user/group/members")
	public ResponseEntity<List<GroupMember>> getAllGroupMembers(){
		List<GroupMember> list = alertStatusService.getAllGroupMembers();
		return new ResponseEntity<List<GroupMember>>(list, HttpStatus.OK);
	}
}