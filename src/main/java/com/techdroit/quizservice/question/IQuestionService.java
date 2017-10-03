package com.techdroit.quizservice.question;

import java.util.List;

public interface IQuestionService {
	
	List<Question> getAllQuestions();
	Question getQuestionById(long questionId);
	List<Question> getAllQuestionsByQuizId(long quizId);
	boolean addQuestion(Question question);
	void updateQuestion(Question question);
	void deleteQuestion(long questionId);
}