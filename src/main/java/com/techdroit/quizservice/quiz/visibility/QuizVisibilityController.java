package com.techdroit.quizservice.quiz.visibility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizVisibilityController {
	
	@Autowired
	private IQuizVisibilityService alertStatusService;
	
	@GetMapping("quiz/visibility")
	public ResponseEntity<List<QuizVisibility>> getAllQuizVisibility(){
		List<QuizVisibility> list = alertStatusService.getAllQuizVisibility();
		return new ResponseEntity<List<QuizVisibility>>(list, HttpStatus.OK);
	}
}