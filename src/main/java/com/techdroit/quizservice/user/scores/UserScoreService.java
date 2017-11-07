package com.techdroit.quizservice.user.scores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserScoreService implements IUserScoreService {

	@Autowired
	private IUserScoreDAO userScoreDAO;
	
	@Override
	public List<UserScore> getAllUserScores() {
		// TODO Auto-generated method stub
		return userScoreDAO.getAllUserScores();
	}
}