package com.techdroit.quizservice.user.grps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService implements IUserGroupService {

	@Autowired
	private IUserGroupDAO userGroupDAO;
	
	@Override
	public List<UserGroup> getAllUserGroups() {
		// TODO Auto-generated method stub
		return userGroupDAO.getAllUserGroups();
	}
}