package com.techdroit.quizservice.quiz.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizInfoService implements IQuizInfoService {

	@Autowired
	private IQuizInfoDAO quizInfoDAO;
	
	@Override
	public List<QuizInfo> getAllQuizInfo() {
		// TODO Auto-generated method stub
		return quizInfoDAO.getAllQuizInfo();
	}
}