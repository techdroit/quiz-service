package com.techdroit.quizservice.question.types;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeService implements IQuestionTypeService {

	@Autowired
	IQuestionTypeDAO questionTypeDAO;
	
	@Override
	public QuestionType getQuestionTypeById(int id) {
		// TODO Auto-generated method stub
		return questionTypeDAO.getQuestionTypeById(id);
	}

	@Override
	public List<QuestionType> getAllQuestionTypes() {
		// TODO Auto-generated method stub
		return questionTypeDAO.getAllQuestionTypes();
	}
}