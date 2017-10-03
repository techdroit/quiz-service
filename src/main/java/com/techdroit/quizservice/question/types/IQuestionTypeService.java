package com.techdroit.quizservice.question.types;

import java.util.List;

public interface IQuestionTypeService {

	QuestionType getQuestionTypeById(int id);
	List<QuestionType> getAllQuestionTypes();
}