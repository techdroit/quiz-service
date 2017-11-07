package com.techdroit.quizservice.question.optionstatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionOptionStatusService implements IQuestionOptionStatusService {

	@Autowired
	private IQuestionOptionStatusDAO questionOptionStatusDAO;
	
	@Override
	public List<QuestionOptionStatus> getAllQuestionOptionStatus() {
		// TODO Auto-generated method stub
		return questionOptionStatusDAO.getAllQuestionOptionStatus();
	}
}