package com.techdroit.quizservice.user.roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService implements IUserRoleService {

	@Autowired
	private IUserRoleDAO userRoleDAO;
	
	@Override
	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		return userRoleDAO.getAllUserRoles();
	}
}