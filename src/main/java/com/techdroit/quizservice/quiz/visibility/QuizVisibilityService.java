package com.techdroit.quizservice.quiz.visibility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizVisibilityService implements IQuizVisibilityService {

	@Autowired
	private IQuizVisibilityDAO quizVisibilityDAO;
	
	@Override
	public List<QuizVisibility> getAllQuizVisibility() {
		// TODO Auto-generated method stub
		return quizVisibilityDAO.getAllQuizVisibility();
	}
}