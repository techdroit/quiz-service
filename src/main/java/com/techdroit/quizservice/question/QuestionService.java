package com.techdroit.quizservice.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService {

	@Autowired
	IQuestionDAO questionDAO;
	
	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDAO.getAllQuestions();
	}
	
	@Override
	public List<Question> getAllQuestionsByQuizId(long quizId) {
		// TODO Auto-generated method stub
		return questionDAO.getAllQuestionsByQuizId(quizId);
	}

	@Override
	public Question getQuestionById(long questionId) {
		// TODO Auto-generated method stub
		return questionDAO.getQuestionById(questionId);
	}

	@Override
	public synchronized boolean addQuestion(Question question){
       if (questionDAO.questionExists(question.getQuestionName())) {
    	   return false;
       } else {
    	   questionDAO.addQuestion(question);
    	   return true;
       }
	}

	@Override
	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDAO.updateQuestion(question);
	}

	@Override
	public void deleteQuestion(long questionId) {
		// TODO Auto-generated method stub
		questionDAO.deleteQuestion(questionId);
	}
}