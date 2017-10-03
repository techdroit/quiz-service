package com.techdroit.quizservice.question;

import java.util.List;

public interface IQuestionDAO {

	List<Question> getAllQuestions();
	List<Question> getAllQuestionsByQuizId(long quizId);
	Question getQuestionById(long questionId);
	void addQuestion(Question question);
	void updateQuestion(Question question);
	void deleteQuestion(long questionId);
	boolean questionExists(String questionName);
}