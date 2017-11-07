package com.techdroit.quizservice.user.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStatusService implements IUserStatusService {

	@Autowired
	private IUserStatusDAO userStatusDAO;
	
	@Override
	public List<UserStatus> getAllAlertStatus() {
		// TODO Auto-generated method stub
		return userStatusDAO.getAllAlertStatus();
	}
}