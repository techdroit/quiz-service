package com.techdroit.quizservice.user.grps.mbrs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupMemberService implements IGroupMemberService {

	@Autowired
	private IGroupMemberDAO groupMemberDAO;
	
	@Override
	public List<GroupMember> getAllGroupMembers() {
		// TODO Auto-generated method stub
		return groupMemberDAO.getAllGroupMembers();
	}
}