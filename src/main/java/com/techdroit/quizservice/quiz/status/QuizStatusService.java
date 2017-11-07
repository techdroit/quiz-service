package com.techdroit.quizservice.quiz.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizStatusService implements IQuizStatusService {

	@Autowired
	private IQuizStatusDAO quizStatusDAO;
	
	@Override
	public List<QuizStatus> getAllQuizStatus() {
		// TODO Auto-generated method stub
		return quizStatusDAO.getAllQuizStatus();
	}
}