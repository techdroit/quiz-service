package com.techdroit.quizservice.question.types;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("quiz")
public class QuestionTypeController {

	@Autowired
	private IQuestionTypeService questionTypeService;
	
	@GetMapping("question/type/{id}")
	public ResponseEntity<QuestionType> getQuestionTypeById(@PathVariable("id") int id) {
		QuestionType questionType = questionTypeService.getQuestionTypeById(id);
		return new ResponseEntity<QuestionType>(questionType, HttpStatus.OK);
	}
	
	@GetMapping("question/types")
	public ResponseEntity<List<QuestionType>> getAllQuestionTypes() {
		List<QuestionType> list = questionTypeService.getAllQuestionTypes();
		return new ResponseEntity<List<QuestionType>>(list, HttpStatus.OK);
	}
}