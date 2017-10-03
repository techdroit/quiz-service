package com.techdroit.quizservice.question.types;

import java.util.List;

public interface IQuestionTypeDAO {

	QuestionType getQuestionTypeById(int id);
	List<QuestionType> getAllQuestionTypes();
}